import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length()==0) return true;
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        map.put('>','<');
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(c) && stack.peek()== map.get(c)){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
}

