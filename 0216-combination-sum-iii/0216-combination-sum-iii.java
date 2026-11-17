import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int start, int k, int n,
                   List<Integer> path, List<List<Integer>> ans) {

        if (k == 0) {
            if (n == 0) {
                ans.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) break;

            path.add(i);

            backtrack(i + 1, k - 1, n - i, path, ans);

            path.remove(path.size() - 1);
        }
    }
}