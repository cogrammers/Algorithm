// package whatever; // don't place package name!

import java.io.*;
import java.util.*;

class Solution {
  public static void mergeSort(int[] arr) {
    if (arr.length == 0 || arr == null) {
      return;
    }
    int[] temp = new int[arr.length];
    sort(arr, 0, arr.length - 1, temp);
  }
  public static void sort(int[] arr, int start, int end, int[] temp) {
    if (start >= end) {
      return;
    }
    int mid = (start + end) / 2;
    sort(arr, start, mid, temp);
    sort(arr, mid + 1, end, temp);
    merge(arr, start, mid, end, temp);
  }

  public static void merge(int[] arr, int start, int mid, int end, int[] temp) {
    int left = start;
    int right = mid + 1;
    int index = start;

    while (left <= mid && right <= end) {
      if (arr[left] <= arr[right]) {
        temp[index++] = arr[left++];
      } else {
        temp[index++] = arr[right++];
      }
    }

    while (left <= mid) {
      temp[index++] = arr[left++];
    }
    while (right <= mid) {
      temp[index++] = arr[right++];
    }
    for (index =start; index <= end; index++) {
      arr[index] = temp[index];
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[] {5, 4, 3, 2, 1};
    mergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
