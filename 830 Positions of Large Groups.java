import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = left;
        while(left < S.length()){
            while(right < S.length() && S.charAt(left)==S.charAt(right)){
                right++;
            }
            if(right - left >= 3) result.add(Arrays.asList(left, right-1));
            left = right;
        }
        return result;
 
    }
}
