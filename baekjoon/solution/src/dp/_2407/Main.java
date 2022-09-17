package dp._2407;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BigInteger[][] dp = new BigInteger[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        System.out.println(combination(n, m));
    }

    private static BigInteger combination(int n, int r) {
        if (dp[n][r] != null) {
            return dp[n][r];
        }

        if (n == r || r == 0) {
            return dp[n][r] = new BigInteger("1");
        }

        return dp[n][r] = combination(n - 1, r - 1).add(combination(n - 1, r));
    }
}
