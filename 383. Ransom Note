class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] arr = new int [26];
        for(char i : magazine.toCharArray()) arr[i - 'a'] ++;
        
        for(char i : ransomNote.toCharArray()) {
            arr[i - 'a'] --;
            if(arr[i - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}