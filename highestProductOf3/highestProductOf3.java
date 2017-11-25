class Solution {
  public static int highestProductOf3(int[] nums) {
    if (nums.length < 3) {
      throw new IllegalArgumentException("Getting product requires at least of 3 numbers.");
    }
    int highestOf3 = nums[0] * nums[1] * nums[2];
    int highestOf2 = nums[0] * nums[1];
    int highest = nums[0];
    int lowestOf2 = nums[0] * nums[1];
    int lowest = nums[0];

    for (int i = 2; i < nums.length; i++) {
      highestOf3 = Math.max(
        highestOf3,
        Math.max(highestOf2 * nums[i], lowestOf2 * nums[i])
      );

      highestOf2 = Math.max(
        highestOf2,
        Math.max(highest * nums[i], lowest * nums[i])
      );

      lowestOf2 = Math.min(
        lowestOf2,
        Math.min(highest * nums[i], lowest * nums[i])
      );
      highest = Math.max(highest, nums[i]);
      lowest = Math.min(lowest, nums[i]);
    }
    return highestOf3;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int[] nums = {1, 2, 3, 4, 5, 6, -7, -8, 9};
    // int[] nums = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
    System.out.println(highestProductOf3(nums));
  }
}
