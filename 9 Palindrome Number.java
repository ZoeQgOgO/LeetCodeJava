class Solution {
    public boolean isPalindrome(int x) {
        char s[] = Integer.toString(x).toCharArray();
        for(int i =0, j = s.length-1; i < j; i++,j--){
            if(s[i] !=s[j]){
                return false;
            }
        }
        return true;
    }
}

class Solution1 {
    public boolean isPalindrome(int x){
        int res = 0;
        int temp = x;
        if(temp < 0) return false;
        while(x > 0){
            res = res*10 + x % 10;
            x /= 10;
        }
        return temp == res;
    }
}