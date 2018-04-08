class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int pointerLeft = 0, pointerRight = nums.length - 1;
        int i = 0;
        while (i <= pointerRight) {
            if (nums[i] == 0) {
                swap(nums, i, pointerLeft);
                pointerLeft++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, pointerRight);
                pointerRight--;
            }
        }
        return;
    }

    private void swap(int[] nums, int crtIndex, int targetIndex) {
        int temp = nums[crtIndex];
        nums[crtIndex] = nums[targetIndex];
        nums[targetIndex] = temp;
    }
}
