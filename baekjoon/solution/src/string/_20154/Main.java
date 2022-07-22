package string._20154;

import java.util.Scanner;

public class Main {
    public static final String WINNER = "I'm a winner!";
    public static final String NOT_WINNER = "You're the winner?";
    static int[] num = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        int sum = 0;
        for (char tmpChar : chars) {
            sum += num[tmpChar - 'A'];

            if (sum > 9) {
                sum %= 10;
            }
        }

        System.out.print(sum % 2 == 1 ? WINNER : NOT_WINNER);
    }
}
