package impl._1212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (number.equals("0")) {
            System.out.println(0);
            return;
        }

        String[] split = number.split("");
        StringBuilder answer = new StringBuilder();

        answer.append(Integer.toBinaryString(Integer.parseInt(split[0])));
        for (int i = 1; i < split.length; i++) {
            String binary = Integer.toBinaryString(Integer.parseInt(split[i]));
            answer.append(String.format("%03d", Integer.parseInt(binary)));
        }

        System.out.println(answer);
    }
}
