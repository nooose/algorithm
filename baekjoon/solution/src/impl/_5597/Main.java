package impl._5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] check = new boolean[31];

        for (int i = 0; i < 28; i++) {
            check[scanner.nextInt()] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
}
