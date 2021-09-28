/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int high = n;
        int low = 0;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid) == true){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}