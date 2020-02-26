class Solution {
    public boolean isUgly(int num) {
        if(num == 0){
            return false;
        }
        return factors(num);
    }
    public boolean factors(int num){
        if(num == 1){
            return true;
        }else if(num % 2==0){
            return factors(num/2);
        }else if(num %3 ==0){
            return factors(num/3);
        }else if (num % 5 ==0){
            return factors(num/5);
        }
        return false;
    }
}