class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        int carry = 0;
        while(n1 >=0 || n2 >=0){
            int sum1 = n1>=0 ? num1.charAt(n1--) -'0' :0;
            int sum2 = n2>=0 ? num2.charAt(n2--) -'0' :0;
            int sum = sum1 + sum2 + carry;
            carry = sum/10;
            result.append(sum%10);
        }
        if(carry > 0){
            result.append(1);
        }
        return result.reverse().toString();
    }
}