class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            // Agar current index reachable nahi hai
            if (i > farthest) {
                return false;
            }

            // Sabse door reachable index update karo
            farthest = Math.max(farthest, i + nums[i]);

            // Agar last index tak pahunch gaye
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}