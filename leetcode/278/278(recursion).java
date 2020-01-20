//ry

//recursion

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return helper(1, n);
    }
    public int helper(int low, int high) {
        int mid = low + (high - low) / 2;
        if(low == mid) return isBadVersion(low) ? low : low + 1;
        if(isBadVersion(mid)) return helper(low, mid);
        else return helper(mid + 1, high);
    }
}
