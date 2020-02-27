/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return helper(1,n);
    }
    private int helper(int left, int right){
        if(left>=right) return left;
        else{
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)) return helper(left, mid);
            else return helper(mid+1, right);  
        }
    }
}