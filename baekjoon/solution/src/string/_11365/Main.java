package string._11365;

import java.util.Scanner;

public class Main {
    public static final String END_MESSAGE = "END";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals(END_MESSAGE)) {
                break;
            }

            StringBuilder answer = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                answer.append(input.charAt(i));
            }

            System.out.println(answer);
        }
    }
}
