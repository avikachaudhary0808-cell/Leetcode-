class Solution {
    public int findComplement(int num) {
        StringBuilder s = new StringBuilder();

        while (num > 0) {
            s.append(num % 2);
            num /= 2;
        }

        for (int i = 0; i < s.length(); i++) {
            s.setCharAt(i, s.charAt(i) == '0' ? '1' : '0');
        }

        return Integer.parseInt(s.reverse().toString(), 2);
    }
}


     
 