class Solution {
    public char findTheDifference(String s, String t) {

        int[] count = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Remove characters using t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;

            if (count[c - 'a'] < 0) {
                return c;
            }
        }

        return ' ';
    }
}