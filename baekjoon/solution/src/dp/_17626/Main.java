package dp._17626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[50001];

        dp[0] = 0;
        dp[1] = 1; // 1^2
        dp[2] = 2; // 1^2 + 1^2
        dp[3] = 3; // 1^2 + 1^2 + 1^2
        dp[4] = 1; // 2^2

        int min = 0;
        for (int i = 5; i <= n; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                int tmp = i - j * j;
                min = Math.min(dp[tmp], min);
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[n]);
    }
}
