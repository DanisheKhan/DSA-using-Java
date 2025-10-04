package XGraphs;

public class RFloodFillAlgorithm {
  // Directions: up, down, left, right
  private static final int[] dx = {-1, 1, 0, 0};
  private static final int[] dy = {0, 0, -1, 1};

  public static void main(String[] args) {
    int[][] image = {
      {1, 1, 1, 2},
      {1, 1, 0, 2},
      {1, 0, 1, 2}
    };
    int sr = 1, sc = 1; // starting row and column
    int newColor = 3;

    floodFill(image, sr, sc, newColor);

    // Print the result
    for (int[] row : image) {
      for (int pixel : row) {
        System.out.print(pixel + " ");
      }
      System.out.println();
    }
  }

  public static void floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    if (oldColor == newColor) return;
    dfs(image, sr, sc, oldColor, newColor);
  }

  private static void dfs(int[][] image, int x, int y, int oldColor, int newColor) {
    if (x < 0 || x >= image.length || y < 0 || y >= image[0].length) return;
    if (image[x][y] != oldColor) return;

    image[x][y] = newColor;

    for (int dir = 0; dir < 4; dir++) {
      dfs(image, x + dx[dir], y + dy[dir], oldColor, newColor);
    }
  }
}
