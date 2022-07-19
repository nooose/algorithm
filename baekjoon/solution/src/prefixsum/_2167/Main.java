package prefixsum._2167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] NM = scanner.nextLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] mNumbers = scanner.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(mNumbers[j]);
            }
        }

        int K = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < K; i++) {
            String[] xy = scanner.nextLine().split(" ");
            int startX = Integer.parseInt(xy[0]) - 1;
            int startY = Integer.parseInt(xy[1]) - 1;
            int endX = Integer.parseInt(xy[2]) - 1;
            int endY = Integer.parseInt(xy[3]) - 1;

            int sum = 0;
            for (int x = startX; x <= endX; x++) {
                for (int y = startY; y <= endY; y++) {
                    sum += array[x][y];
                }
            }
            System.out.println(sum);
        }
    }
}
