public class Subsets {
    public class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                res.add(new ArrayList<>());
                return res;
            }
            Arrays.sort(nums); // not necessary
            dfs(nums, 0, new ArrayList<Integer>(), res);
            return res;
        }
        private void dfs(int[] nums, int depth, List<Integer> path, List<List<Integer>> res) {
            if (depth == nums.length) {
                res.add(new ArrayList<Integer>(path));
                return;
            }
            // dont select nums[depth]
            dfs(nums, depth + 1, path, res);
            // select nums[depth]
            path.add(nums[depth]);
            dfs(nums, depth + 1, path, res);
            // trace back
            path.remove(path.size() - 1);
        }
    }
}
