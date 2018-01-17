public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
        return false;
    }
    if (matrix[0] == null || matrix[0].length == 0) {
        return false;
    }
    int row = matrix.length, column = matrix[0].length;
    int start = 0, end = (row * column) - 1;
    while (start + 1 < end) {
        int midIndex = start + (end - start) / 2;
        int midCell = matrix[midIndex / column][midIndex % column];
        if (midCell == target) {
            return true;
        } else if (midCell < target) {
            start = midIndex;
        } else {
            end = midIndex;
        }
    }
    if (matrix[start / column][start % column] == target) {
        return true;
    } else if (matrix[end / column][end % column] == target) {
        return true;
    }

    return false;

}
