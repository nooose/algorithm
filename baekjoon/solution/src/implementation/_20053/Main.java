package implementation._20053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            int min = 1000000;
            int max = -1000000;

            String[] numbers = scanner.nextLine().split(" ");

            for (String strNumber : numbers) {
                int number = Integer.parseInt(strNumber);

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
