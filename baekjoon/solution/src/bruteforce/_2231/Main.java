package bruteforce._2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int M = i;
            for (String s : String.valueOf(i).split("")) {
                M += Integer.parseInt(s);
            }

            if (M == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
