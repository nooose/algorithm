package bruteforce._2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] NM = scanner.nextLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] cards = new int[N];

        String[] InputCards = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(InputCards[i]);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (max < sum && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
