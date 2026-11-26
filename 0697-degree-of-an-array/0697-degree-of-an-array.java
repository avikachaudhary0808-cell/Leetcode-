class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];

        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (count[x] == 0) {
                first[x] = i;
            }

            count[x]++;
            last[x] = i;

            degree = Math.max(degree, count[x]);
        }

        int ans = nums.length;

        for (int i = 0; i < 50000; i++) {
            if (count[i] == degree) {
                ans = Math.min(ans, last[i] - first[i] + 1);
            }
        }

        return ans;
    }
}