package impl._20546;

import java.util.Scanner;

public class Main {
    private final static int JUNHYUN = 0;
    private final static int SEONGMIN = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seedMoney = Integer.parseInt(scanner.nextLine());

        int[] money = new int[2];
        int[] amountOfStock = new int[2];
        money[JUNHYUN] = seedMoney;
        money[SEONGMIN] = seedMoney;
        amountOfStock[JUNHYUN] = 0;
        amountOfStock[SEONGMIN] = 0;

        String[] stockGraph = scanner.nextLine().split(" ");

        int upCount = 0;
        int downCount = 0;
        int previousStock = Integer.parseInt(stockGraph[0]);

        for (int i = 0; i < 13; i++) {
            int stock = Integer.parseInt(stockGraph[i]);

            // 준현
            if (money[JUNHYUN] >= stock) {
                int quotient = money[JUNHYUN] / stock;
                money[JUNHYUN] -= quotient * stock;
                amountOfStock[JUNHYUN] += quotient;
            }

            if (previousStock == stock) {
                upCount = 0;
                downCount = 0;
            }

            // 성민
            if (previousStock > stock) {
                downCount++;
                upCount = 0;
            }

            if (downCount >= 3 && money[SEONGMIN] >= stock) {
                int quotient = money[SEONGMIN] / stock;
                money[SEONGMIN] -= quotient * stock;
                amountOfStock[SEONGMIN] += quotient;

            }



            if (previousStock < stock) {
                upCount++;
                downCount = 0;
            }

            if (upCount >= 3) {
                money[SEONGMIN] += amountOfStock[SEONGMIN] * stock;
                amountOfStock[SEONGMIN] = 0;

            }

            previousStock = stock;
        }

        int[] result = new int[2];
        result[JUNHYUN] = amountOfStock[JUNHYUN] * Integer.parseInt(stockGraph[13]) + money[JUNHYUN];
        result[SEONGMIN] = amountOfStock[SEONGMIN] * Integer.parseInt(stockGraph[13]) + money[SEONGMIN];

        if (result[JUNHYUN] == result[SEONGMIN]) {
            System.out.println("SAMESAME");
            return;
        }

        System.out.println(result[JUNHYUN] > result[SEONGMIN] ? "BNP" : "TIMING");
    }
}
