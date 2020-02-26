class Solution {
    public String toHex(int num) {
        String result = "";
        char[] help = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num ==0) return "0";
        while(num!=0){
            result = help[(num&15)] + result;
            num = (num >>>4);
        }
        return result;
    }
}