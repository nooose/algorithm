package bruteforce._22864;

import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int C;
    static int M;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatigue = 0;
        int amountOfWork = 0;

        A = scanner.nextInt(); // 피로도 증가량
        B = scanner.nextInt(); // 일 처리량
        C = scanner.nextInt(); // 휴식 시 줄어드는 피로도
        M = scanner.nextInt(); // 최대 피로도

        for (int hour = 0; hour < 24; hour++) {
            if (isBurnOutWhenWork(fatigue)) {
                fatigue -= C;
                if (fatigue < 0) {
                    fatigue = 0;
                }
                continue;
            }

            amountOfWork += B;
            fatigue += A;
        }

        System.out.println(amountOfWork);
    }

    public static boolean isBurnOutWhenWork(int fatigue) {
        return fatigue + A > M;
    }
}
