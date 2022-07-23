package dp._2839;

import java.util.Scanner;

public class Main {
    public static final int INF = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] array = new int[5001];

        for (int i = 1; i <= 5000; i++) {
            array[i] = INF;
        }
        array[3] = 1;

        for (int i = 5; i <= 5000; i++) {
            array[i] = Math.min(array[i - 3] + 1, array[i - 5] + 1);
        }

        System.out.println(array[N] >= INF ? -1 : array[N]);
    }
}
