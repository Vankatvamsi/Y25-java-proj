package com.skills;
import java.util.*;
public class S5FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter grid values (0 or 1):");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        System.out.print("Enter starting row: ");
        int sr = sc.nextInt();
        System.out.print("Enter starting column: ");
        int scPos = sc.nextInt();
        System.out.print("Enter new value to fill: ");
        int newColor = sc.nextInt();
        int oldColor = grid[sr][scPos];
        if (oldColor == newColor) {
            System.out.println("No changes needed.");
            return;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { sr, scPos });
        grid[sr][scPos] = newColor;
        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };
        while (!queue.isEmpty()) {
            int[] cell = queue.remove();
            int r = cell[0], c = cell[1];
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i], nc = c + dc[i];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == oldColor) {
                    grid[nr][nc] = newColor;
                    queue.add(new int[] { nr, nc });
                }
            }
        }
        System.out.println("Matrix after flood-fill:");
        for (int[] row : grid) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
