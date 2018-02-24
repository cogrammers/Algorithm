public class Solution {
    class Coordinate {
        int x;
        int y;
        Coordinate(int coor_x, int coor_y) {
                x = coor_x;
                y = coor_y;
        }
    }
    public int zombie(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        int dateCount = 0;
        int prePplCount = 0;
        Queue<Coordinate> queue = new LinkedList<Coordinate>();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    Coordinate coordinate = new Coordinate(row, col);
                    queue.offer(coordinate);
                } else if (grid[row][col] == 0) {
                    prePplCount++;
                }
            }
        }
        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < queue.size(); i++) {
                Coordinate zbCoord = queue.poll();
                infestAround(zbCoord.x, zbCoord.y, grid);
            }
            int pplCount = countPpl(grid);

            if ( pplCount == prePplCount) {
                if (pplCount == 0) {
                    return dateCount;
                } else {
                    return -1;
                }
            } else {
                dateCount++;
                prePplCount = pplCount;
            }
        }
        return dateCount;
    }

    private void infestAround(int row,
                              int col,
                              int[][] grid) {

        int[][] coordinates = {
                                {-1, 0},
                                {0, 1},
                                {1, 0},
                                {0, -1}
                              };
        for (int[] coordinate : coordinates) {
            int rowIndex = row + coordinate[0];
            int colIndex = col + coordinate[1];
            if (isBound(rowIndex, colIndex, grid)) {
                if (grid[rowIndex][colIndex] == 0) {

                    grid[rowIndex][colIndex] = 1;
                }
            }
        }
    }

    private boolean isBound(int rowIndex,
                            int colIndex,
                            int[][] grid) {
        if (rowIndex < 0 || rowIndex >= grid.length || colIndex < 0 || colIndex >= grid[0].length) {
            return false;
        }
        return true;
    }

    private int countPpl(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
