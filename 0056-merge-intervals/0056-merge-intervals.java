class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // First interval ko result me daal do
        int[] current = intervals[0];
        result.add(current);

        // Step 2: Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // Overlap check
            if (current[1] >= next[0]) {
                // Merge: end ko maximum se update karo
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap: next interval ko result me add karo
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
