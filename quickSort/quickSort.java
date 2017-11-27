// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class solution {
  public static void quickSort(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    quickHelper(arr, 0, arr.length - 1);
  }

  public static void quickHelper(int[] arr, int start, int end) {
    if (start > end) {
      return;
    }
    int left = start;
    int right = end;
    int pivot = (start + end) / 2;
    while (left <= right) {
      while (left <= right && arr[left] < arr[pivot]) {
        left++;
      }
      while (left <= right && arr[right] > arr[pivot]) {
        right--;
      }
      if (left <= right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        left++;
        right--;
      }
    }
    quickHelper(arr, left, end);
    quickHelper(arr, start, right);
  }
  public static void main(String[] args) {
    int[] arr = new int[]{5, 4, 3, 2, 1};
    quickSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
