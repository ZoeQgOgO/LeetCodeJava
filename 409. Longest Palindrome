class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int odd = 0;
        int result = 0;
        for(int c : map.values()){
            if(c%2 == 0){
                result += c;
            }else {
                result += (c-1);
                odd = 1;
            }
        }
        return result + odd;
    }
}