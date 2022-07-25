package bruteforce._18312;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int count = 0;
        for (int h = 0; h <= N; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if ((h / 10 == K) || (h % 10 == K) ||
                            (m / 10 == K) || (m % 10 == K) ||
                            (s / 10 == K) || (s % 10 == K)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
