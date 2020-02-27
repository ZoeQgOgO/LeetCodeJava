import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
       for(String str:strs){
           char[] c = str.toCharArray();
           Arrays.sort(c);
           String key = new String(c);
           if(map.containsKey(key)){
               map.get(key).add(str);
           }else{
               List<String> temp = new ArrayList<>();
               temp.add(str);
               result.add(temp);
               map.put(key,temp);
           }
       }
        return result;
    }
}