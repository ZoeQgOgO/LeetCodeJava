class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int a = 0;
        int b = numbers.length -1; 
        if (numbers == null || numbers.length <2) {
            return index;
        }
        while (a < b) {
            int result = numbers[a] + numbers[b];
            if (result == target) {
                index[0] = a + 1;
                index[1] = b + 1;
                break;
            }else if (result < target) {
                a++;
            }else {
                b--;
            }
        }   
        return index;
    }
}