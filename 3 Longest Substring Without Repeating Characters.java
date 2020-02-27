import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //window slider
        int start =0; 
        int end =0;
        int max =0;
        Set<Character> set = new HashSet<>();
        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end ++;
            }else{
                set.remove(s.charAt(start));
                start++;
            }
            max = Math.max((end - start),max);
        }
        return max;
    }
}