package implementation._21918;

import java.util.Scanner;

public class Main {
    static boolean[] bulbs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        bulbs = new boolean[n + 1];

        String[] bulbsStatus = scanner.nextLine().split(" ");
        for (int i = 1; i <= n; i++) {
            bulbs[i] = !bulbsStatus[i - 1].equals("0");
        }

        for (int i = 0; i < m; i++) {
            String[] cmd = scanner.nextLine().split(" ");

            int a = Integer.parseInt(cmd[0]);
            int b = Integer.parseInt(cmd[1]);
            int c = Integer.parseInt(cmd[2]);

            switch (a) {
                case 1:
                    changeStatus(b, c);
                    break;
                case 2:
                    flipStatus(b, c);
                    break;
                case 3:
                    turnOff(b, c);
                    break;
                case 4:
                    turnOn(b, c);
                    break;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(bulbs[i] ? 1 : 0);
            System.out.print(" ");
        }
    }

    private static void changeStatus(int i, int x) {
        bulbs[i] = x != 0;
    }

    private static void flipStatus(int l, int r) {
        for (int i = l; i <= r; i++) {
            bulbs[i] = !bulbs[i];
        }
    }

    private static void turnOff(int l, int r) {
        for (int i = l; i <= r; i++) {
            bulbs[i] = false;
        }
    }

    private static void turnOn(int l, int r) {
        for (int i = l; i <= r; i++) {
            bulbs[i] = true;
        }
    }
}
