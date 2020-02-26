class Solution {
    public String multiply(String num1, String num2) {
        if(num1 =="0" || num2 == "0") return "0";
        int[] result = new int[num1.length() + num2.length()];
        for(int i = num1.length()-1; i >=0; i--){
            for(int j = num2.length()-1; j>=0; j--){
                int p1 = num1.charAt(i)-'0';
                int p2 = num2.charAt(j)-'0';
                result[i+j+1] += p1*p2;
            }
        }
        int carry = 0;
        for(int i = result.length-1;i >=0; i--){
            int curr = (result[i]+carry)%10;
            carry = (result[i]+carry)/10;
            result[i]=curr;
        }
        int index = 0;
        while(index < result.length && result[index] ==0) index++;
        StringBuilder s = new StringBuilder();
        for(int i =index; i < result.length; i++){
            if(i ==0 && result[i]==0) continue;
            s.append(result[i]);
        }
        return s.length()==0? "0" : s.toString();
    }
}