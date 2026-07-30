class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        // Count letters in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Use letters for ransom note
        for (char ch : ransomNote.toCharArray()) {

            count[ch - 'a']--;

            if (count[ch - 'a'] < 0)
                return false;
        }

        return true;
    }
}