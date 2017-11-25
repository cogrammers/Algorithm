class Solution {
  public static int[] getProductsOfAllIntsExceptAtIndex(int[] nums) {
    if (nums.length < 2) {
      throw new IllegalArgumentException("Getting a product requires at least 2 numbers.");
    }

    int[] productsExceptAtIndex = new int[nums.length];

    int startProduct = 1;
    for (int i =0; i < nums.length; i++) {
      productsExceptAtIndex[i] = startProduct;
      startProduct *= nums[i];
    }

    startProduct = 1;
    for(int i = nums.length - 1; i >= 0; i--) {
      productsExceptAtIndex[i] *= startProduct;
      startProduct *= nums[i];
    }
    return productsExceptAtIndex;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // int[] nums = {1};
    // int[] nums = {0, 1, 2, 3, 4, 0};
    System.out.println(getProductsOfAllIntsExceptAtIndex(nums));
  }
}
