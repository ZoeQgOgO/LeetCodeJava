class Solution {
    public int integerReplacement(int n) {
        return (int)replace(n);
    }
    public long replace(long n){
        if(n<3) return n-1;
        if(n %2 ==0){
            return replace(n/2) +1;
        }else{
            return Math.min(replace(n-1), replace(n+1)) +1;
        }
    }
    
}