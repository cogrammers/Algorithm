public boolean searchMatrix(int[][] matrix, int target) {
  if (matrix == null || matrix.length == 0) {
    return false;
  }
  if (matrix[0] == null || matrix[0].length == 0) {
    return false;
  }
  int row = matrix.length, col = matrix[0].length;
  int start = 0, end = row * col - 1;
  while (start + 1 < end) {
    int mid = start + (end - start) / 2;
    int temp = matrix[mid / col][mid % col];
    if (temp == target) {
      return true;
    } else if (temp < target) {
      start = mid;
    } else {
      end = mid;
    }
  }
  if (matrix[start / col][start % col] == target) {
    return true;
  }
  if (matrix[end / col][end % col] == target) {
    return true;
  }
  return false;
}
