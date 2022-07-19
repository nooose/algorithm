package string._11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();

        String[] split = number.split("");
        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += Integer.parseInt(split[i]);
        }

        System.out.println(answer);
    }
}
