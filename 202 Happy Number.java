import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> set = new ArrayList();
    public boolean isHappy(int n) {  
        int result = 0;
        while( n > 0){
            int temp = n % 10;
            result += temp * temp;
            n /= 10;
        }
        if( result ==1){
            return true;
        }else if(set.contains(result)){
            return false;
        }else{
            set.add(result);
        }
       return isHappy(result);
    }
}