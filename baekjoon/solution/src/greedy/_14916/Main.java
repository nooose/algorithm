package greedy._14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int INF = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];

        dp[1] = INF;
        dp[2] = 1;
        dp[3] = INF;
        dp[4] = 2;
        dp[5] = 1;

        for (int i = 6; i <= change; i++) {
            dp[i] = Math.min(dp[i - 5] + 1, dp[i - 2] + 1);
        }

        System.out.println(dp[change] >= INF ? -1 : dp[change]);
    }
}
