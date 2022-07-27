package bruteforce._15721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 참여 인원 수
        int T = scanner.nextInt(); // 구하고자 하는 번째
        int sign = scanner.nextInt(); // 0, 1

        int bun = 0;
        int degi = 0;
        int N = 2;

        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    bun++;
                } else {
                    degi++;
                }

                if (bun == T && sign == 0) {
                    System.out.println((bun + degi - 1) % A);
                    return;
                }
                if (degi == T && sign == 1) {
                    System.out.println((bun + degi - 1) % A);
                    return;
                }
            }


            for (int i = 0; i < N; i++) {
                bun++;
                if (bun == T && sign == 0) {
                    System.out.println((bun + degi - 1) % A);
                    return;
                }
            }
            for (int i = 0; i < N; i++) {
                degi++;
                if (degi == T && sign == 1) {
                    System.out.println((bun + degi - 1) % A);
                    return;
                }
            }

            N++;
        }
    }
}
