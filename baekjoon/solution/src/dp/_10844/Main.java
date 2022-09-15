package dp._10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[101][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
            dp[2][i] = 2;
        }
        dp[2][0] = 1;
        dp[2][9] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 8; j++) {
                dp[i][j] = dp[i - 1][j - 1] % 1000000000 + dp[i - 1][j + 1] % 1000000000;
            }
            dp[i][9] = dp[i - 1][8];
        }

        long sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum % 1000000000);
    }
}
