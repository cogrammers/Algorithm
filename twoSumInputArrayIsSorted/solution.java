public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        int start = 0, end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                int[] result = {start + 1, end + 1};
                return result;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        int[] result = {};
        return result;
    }
}
