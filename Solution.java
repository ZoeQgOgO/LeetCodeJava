public class Solution{
    public int myAtoi(String str){
        str = str.trim();
        if(str.length() == 0 || str == null){
            return 0;
        }
        double result = 0;
        boolean isNegative = false;
        int index = 0;
        if(str.charAt(0) == '+' || str.charAt(0) == '-'){
            index ++;
        }
        if(str.charAt(0)== '-'){
            isNegative = true;
        }
        for(int i = index; i < str.length();i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }
            int digit = (int)(str.charAt(i)-'0');
            result = result*10 + digit;
        }
        if(isNegative){
            result = -result;
        }
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }
}