class Solution {
    public String convert(String s, int numRows) {
        
        // edge case
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // har row ke liye StringBuilder
        StringBuilder[] rows = new StringBuilder[numRows];
        
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // direction change
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // result combine karo
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}