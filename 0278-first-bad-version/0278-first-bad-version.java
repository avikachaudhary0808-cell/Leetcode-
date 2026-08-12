public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // mid bad hai, first bad mid ya usse pehle ho sakta hai
                right = mid;
            } else {
                // mid good hai, first bad uske baad hoga
                left = mid + 1;
            }
        }

        return left;
    }
}