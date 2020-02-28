import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length()==0) return true;
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> res = new Stack<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        map.put('>','<');
        for(char c: s.toCharArray()){
            if(!res.isEmpty() && map.containsKey(c) && res.peek()== map.get(c)){
                res.pop();
                continue;
            }
            res.push(c);
        }
        return res.isEmpty();
    }
}