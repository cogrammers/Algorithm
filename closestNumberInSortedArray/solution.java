public class Solution {
    public int closestNumber(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[mid] < target) {
                start = mid;
            }
            if (A[mid] > target) {
                end = mid;
            }
        }
        if (A[start] == target) {
            return start;
        } else if (A[end] == target) {
            return end;
        } else  if ((target - A[start]) <= (A[end] - target)) {
            return start;
        } else {
            return end;
        }
    }
}
