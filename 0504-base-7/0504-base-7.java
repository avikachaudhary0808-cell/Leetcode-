class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean negative = num < 0;
        long n = Math.abs((long) num);
        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            ans.append(n % 7);
            n /= 7;
        }

        if (negative) {
            ans.append("-");
        }

        return ans.reverse().toString();
    }
}