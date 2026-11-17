import java.util.*;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder sb = new StringBuilder();

            int i = 0;

            while (email.charAt(i) != '@' && email.charAt(i) != '+') {
                if (email.charAt(i) != '.') {
                    sb.append(email.charAt(i));
                }
                i++;
            }

            while (email.charAt(i) != '@') {
                i++;
            }

            sb.append(email.substring(i));

            set.add(sb.toString());
        }

        return set.size();
    }
}