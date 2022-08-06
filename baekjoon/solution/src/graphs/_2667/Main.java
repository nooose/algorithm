package graphs._2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private final static int[] dX = {-1, 1, 0, 0};
    private final static int[] dY = {0, 0, -1, 1};

    private static int[][] map;
    private static boolean[][] visited;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            String[] houses = br.readLine().split("");
            for (int j = 1; j < n + 1; j++) {
                map[i][j] = Integer.parseInt(houses[j - 1]);
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    result.add(bfs(new Point(i, j)));
                }
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println(result.size());
        for (Integer count : result) {
            System.out.println(count);
        }
    }

    private static int bfs(Point startPoint) {
        Queue<Point> queue = new LinkedList<>();
        int count = 0;
        queue.add(startPoint);
        visited[startPoint.x][startPoint.y] = true;
        count++;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                Point nextPoint = new Point(point.x + dX[i], point.y + dY[i]);

                if (nextPoint.x < 1 || nextPoint.x > n ||
                    nextPoint.y < 1 || nextPoint.y > n ||
                    map[nextPoint.x][nextPoint.y] == 0 ||
                    visited[nextPoint.x][nextPoint.y]) {
                    continue;
                }

                queue.add(nextPoint);
                visited[nextPoint.x][nextPoint.y] = true;
                count++;
            }
        }

        return count;
    }

    private static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
