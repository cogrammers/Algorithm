
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Coordinate {
  int x, y;
  public Coordinate(int x, int y) {
    x = x;
    y = y;
  }
  public Coordinate[] nextCoordinates() {
    Coordinate[] nexts = new Coordinate[4];
    nexts[0] = new Coordinate(x + 1, y);
    nexts[1] = new Coordinate(x, y + 1);
    nexts[2] = new Coordinate(x - 1, y);
    nexts[3] = new Coordinate(x, y - 1);
    return nexts;
  }

}

class Maze {
  int[][] map;
  public Maze(int[][] map) {
    map = map;
  }
  public boolean isValid(int x, int y) {
    if (x < 0 || y < 0) {
      return false;
    }
    if (x > map.length || y > map[0].length) {
      return false;
    }
    return true;
  }
}

class Solution {

  public static int shortSteps(Maze maze, Coordinate start, Coordinate stop) {
    if (!maze.isValid(start.x, start.y) || !maze.isValid(stop.x, stop.y)) {
      return -1;
    }
    int[][] mazeMap = maze.map;
    boolean[][] visited = new boolean[mazeMap.length][mazeMap[0].length];
    int steps = 0;
    Queue<Coordinate> queue = new LinkedList<Coordinate>();
    queue.add(start);
    int queueSize = 0;
    while (!queue.isEmpty()) {
      queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        Coordinate crt = queue.poll();
        if (start == stop) {
          return steps;
        }
        for (Coordinate next : crt.nextCoordinates()) {
          if (maze.isValid(next.x, next.y)) {
            visited[next.x][next.y] = true;
            queue.add(next);
          }
        }
      }
      steps++;
    }
    return -1;
  }


  public static void main(String[] args) {
    int[][] map = {
      {0,0,1,0,0},
      {0,0,0,0,0},
      {0,0,0,1,0},
      {1,1,0,1,1},
      {0,0,0,0,0}
    };

    Maze maze = new Maze(map);
    Coordinate start = new Coordinate(0,0);
    Coordinate stop = new Coordinate(4,4);
    int steps = shortSteps(maze, start, stop);
    System.out.println(steps);
  }


}
