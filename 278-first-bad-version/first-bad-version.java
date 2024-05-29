/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;
        int bad_version = 0;
        while (low <= high) {
           int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                bad_version = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return bad_version;

    }
    // BY GANESH JAGGINENI
}