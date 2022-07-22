package string._10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] array = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String string = sc.nextLine();
            char[] chars = string.toCharArray();

            System.arraycopy(chars, 0, array[i], 0, chars.length);
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                char tmp = array[j][i];
                if (isValidChar(tmp)) {
                    System.out.print(tmp);
                }
            }
        }
    }

    private static boolean isValidChar(char tmp) {
        return (tmp >= 'a' && tmp <= 'z') || (tmp >= '0' && tmp <= '9') || (tmp >= 'A' && tmp <= 'Z');
    }
}
