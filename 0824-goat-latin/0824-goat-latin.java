class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char c = Character.toLowerCase(word.charAt(0));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ans.append(word);
            } else {
                ans.append(word.substring(1)).append(word.charAt(0));
            }

            ans.append("ma");

            for (int j = 0; j <= i; j++) {
                ans.append('a');
            }

            if (i < words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}