class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        // 32-bit integer => maximum 8 hexadecimal digits
        for (int i = 0; i < 8; i++) {

            int digit = num & 15;  // Get last 4 bits

            result.append(hex[digit]);

            // Unsigned right shift
            num >>>= 4;

            if (num == 0) {
                break;
            }
        }

        return result.reverse().toString();
    }
}