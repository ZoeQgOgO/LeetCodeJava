import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i =0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                if(map.get(s.charAt(i)) != null){
                    map.remove(s.charAt(i));
                }
            }else{
                    map.put(s.charAt(i), i);
                    set.add(s.charAt(i));
                }
        }
        if(map.size() == 0) return -1;
        return map.entrySet().iterator().next().getValue();
    }
}