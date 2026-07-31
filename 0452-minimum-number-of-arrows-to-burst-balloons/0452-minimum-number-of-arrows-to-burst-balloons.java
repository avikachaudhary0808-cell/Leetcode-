class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int arrows = 1;
        int arrow = points[0][1];

        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > arrow) {

                // No overlap
                arrows++;
                arrow = points[i][1];

            } else {

                // Overlap hai
                arrow = Math.min(arrow, points[i][1]);
            }
        }

        return arrows;
    }
}