class Solution {
    public char findTheDifference(String s, String t) {
        char[] array_s = s.toCharArray();
        char[] array_t = t.toCharArray();
        
        int m =0;
        int n =0;
        
        for(int i =0; i <array_s.length; i++){
            m += (int)array_s[i];
        }
        
        for(int j =0; j < array_t.length; j++){
            n += (int)array_t[j];
        }
        
        return (char)(n - m);
    }
}