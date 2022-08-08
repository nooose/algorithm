package data_structures._9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String LEFT_PARENTHESIS = "(";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] parentheses = br.readLine().split("");
            int count = 0;

            for (String parenthesis : parentheses) {
                if (parenthesis.equals(LEFT_PARENTHESIS)) {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) {
                    count = 1;
                    break;
                }
            }

            System.out.println(count == 0 ? "YES" : "NO");
        }
    }
}
