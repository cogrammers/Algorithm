class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) {
            return results;
        }
        if (nums.length == 0) {
            results.add(new ArrayList<>());
            return results;
        }

        List<Integer> list = new ArrayList<Integer>();
        dfs(nums, list, results);
        return results;
    }

    private void dfs(int[] nums,
                     List<Integer> list,
                     List<List<Integer>> results) {
        if (nums.length == list.size()) {
            results.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }

            list.add(nums[i]);
            dfs(nums, list, results);
            list.remove(list.size() - 1);
        }
    }
}
