class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {

            i = getNextValidIndex(s, i);
            j = getNextValidIndex(t, j);

            // Both strings are finished
            if (i < 0 && j < 0) {
                return true;
            }

            // One string is finished
            if (i < 0 || j < 0) {
                return false;
            }

            // Characters are different
            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    private int getNextValidIndex(String str, int index) {

        int backspaces = 0;

        while (index >= 0) {

            if (str.charAt(index) == '#') {
                backspaces++;
            } 
            else if (backspaces > 0) {
                backspaces--;
            } 
            else {
                break;
            }

            index--;
        }

        return index;
    }
}