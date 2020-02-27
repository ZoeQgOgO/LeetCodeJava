class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if(n < 3) return n;
        int ans = 2;
        for(int i =3; i <= n; i++){
            ans = a + b;
            a = b;
            b = ans;
        }
        return ans;
    }
}