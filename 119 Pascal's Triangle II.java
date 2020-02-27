import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> last = new ArrayList<Integer>();
        last.add(1);
        for(int i =1; i < rowIndex +1; i++){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int j = 1; j < i; j++){
                newList.add(last.get(j-1) + last.get(j));
            }
            newList.add(1);
            last = newList;
        }
        return last;
    }
}
