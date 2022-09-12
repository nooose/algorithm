package dp._9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] dp = new int[2][100001];
        int[][] score = new int[2][100001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

            for (int j = 1; j <= n; j++) {
                score[0][j] = Integer.parseInt(tokenizer.nextToken());
            }

            tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                score[1][j] = Integer.parseInt(tokenizer.nextToken());
            }

            dp[0][1] = score[0][1];
            dp[1][1] = score[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = score[0][j] + Math.max(dp[1][j - 1], dp[1][j - 2]);
                dp[1][j] = score[1][j] + Math.max(dp[0][j - 1], dp[0][j - 2]);
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
