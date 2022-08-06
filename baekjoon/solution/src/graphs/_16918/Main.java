package graphs._16918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private final static int[] dX = {-1, 1, 0, 0};
    private final static int[] dY = {0, 0, -1, 1};

    private static int[][] grid;
    private static int r;
    private static int c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        r = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());


        // 폭탄 초기화
        grid = new int[r + 1][c + 1];
        for (int i = 1; i < r + 1; i++) {
            String[] input = br.readLine().split("");
            for (int j = 1; j < c + 1; j++) {
                grid[i][j] = input[j - 1].equals("O") ? 3 : 0;
            }
        }

        for (int i = 1; i < n; i++) {
            // 폭탄 카운팅
            countBomb();

            // 폭탄이 설치되어 있지 않은 모든 칸에 폭탄을 설치
            if (i % 2 == 1) {
                plantBomb();
                continue;
            }

            // 전에 설치된 폭탄이 모두 폭발
            explodeBomb();
        }

        printGrid();
    }

    private static void countBomb() {
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (grid[i][j] >= 2) {
                    grid[i][j] = grid[i][j] - 1;
                }
            }
        }
    }

    private static void plantBomb() {
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 3;
                }
            }
        }
    }

    private static void explodeBomb() {
        for (int x = 1; x < r + 1; x++) {
            for (int j = 1; j < c + 1; j++) {
                if (isTimeOutBomb(x, j)) {
                    explodeBomb(new Point(x, j));
                }
            }
        }
    }

    private static void explodeBomb(Point startPoint) {
        grid[startPoint.x][startPoint.y] = 0;

        for (int i = 0; i < 4; i++) {
            Point nextPoint = new Point(startPoint.x + dX[i], startPoint.y + dY[i]);

            if (nextPoint.x < 1 || nextPoint.x > r ||
                    nextPoint.y < 1 || nextPoint.y > c ||
                    isTimeOutBomb(nextPoint.x, nextPoint.y)) {
                continue;
            }

            grid[nextPoint.x][nextPoint.y] = 0;
        }
    }

    private static boolean isTimeOutBomb(int i, int j) {
        return grid[i][j] == 1;
    }

    private static void printGrid() {
        for (int i = 1; i < r + 1; i++) {
            for (int j = 1; j < c + 1; j++) {
                if (grid[i][j] == 0) {
                    System.out.print(".");
                    continue;
                }
                System.out.print("O");
            }
            System.out.println();
        }
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
