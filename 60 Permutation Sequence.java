import java.util.ArrayList;

class Solution{
    public String getPermutation(int n, int k){
        ArrayList<Integer> num = new ArrayList<>();
        for(int i =1; i <= n ; i++){
            num.add(i);
        }
        k--;
        int mod = 1;
        for(int i =1; i <=n; i++){
            mod = mod * i;
        }
        String res = "";
        for(int i =0; i < n; i++){
            mod = mod/(n-i);
            int curIndex = k / mod;
            k = k % mod; 

            res += num.get(curIndex);
            num.remove(curIndex);
        }
        return res.toString();
    }
}