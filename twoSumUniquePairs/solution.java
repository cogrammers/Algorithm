public class Solution {
    public int twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target && !set.contains(nums[left])) {
                count++;

                set.add(nums[left]);
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }
}
