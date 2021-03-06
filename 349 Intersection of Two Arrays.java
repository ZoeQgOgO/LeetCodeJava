import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int i =0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i =0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                inter.add(nums2[i]);
            }
        }
        int[] result = new int [inter.size()];
        int j =0;
        for(Integer num : inter) {
            result[j++] = num;
        }
        return result;   
    }
}