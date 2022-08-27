package greedy._1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());

            sb.append(combination(m, n)).append("\n");
        }

        System.out.println(sb);
    }

    private static int combination(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
