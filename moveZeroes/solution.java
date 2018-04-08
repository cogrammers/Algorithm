public class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0, end = 0;

        while (end < nums.length) {
            if (nums[end] != 0 && nums[start] == 0) {
                nums[start] = nums[end];
                nums[end] = 0;
                start++;
            } else if (nums[end] != 0 && nums[start] != 0) {
                start++;
            }
            end++;
        }
    }
}
