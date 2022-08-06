package graphs._2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int[][] maze;
    private final static int[] dX = {-1, 1, 0, 0};
    private final static int[] dY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        maze = new int[n + 1][m + 1];

        // 미로 초기화
        for (int i = 1; i <= n; i++) {
            String[] numbers = br.readLine().split("");
            for (int j = 0; j < numbers.length; j++) {
                maze[i][j + 1] = Integer.parseInt(numbers[j]);
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(1, 1));

        // 미로 시작
        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = currentPoint.x + dX[i];
                int nextY = currentPoint.y + dY[i];
                Point nextPoint = new Point(nextX, nextY);

                if (isValid(nextPoint)) {
                    if (isFirstVisit(nextPoint)) {
                        maze[nextPoint.x][nextPoint.y] = maze[currentPoint.x][currentPoint.y] + 1;
                        queue.add(nextPoint);
                        continue;
                    }

                    if (maze[nextPoint.x][nextPoint.y] > maze[currentPoint.x][currentPoint.y] + 1) {
                        maze[nextPoint.x][nextPoint.y] = maze[currentPoint.x][currentPoint.y] + 1;
                        queue.add(nextPoint);
                    }
                }
            }
        }

        System.out.println(maze[n][m]);
    }

    private static boolean isValid(Point nextPoint) {
        return nextPoint.isValidRange() && isNotWall(nextPoint);
    }

    private static boolean isNotWall(Point point) {
        return maze[point.x][point.y] >= 1;
    }

    private static boolean isFirstVisit(Point nextPoint) {
        return maze[nextPoint.x][nextPoint.y] == 1;
    }

    private static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isValidRange() {
            return x > 0 && x <= n && y > 0 && y <= m;
        }
    }
}
