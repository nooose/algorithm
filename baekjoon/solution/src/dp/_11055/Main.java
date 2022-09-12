package dp._11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int[1001];
        int[] dp = new int[1001];

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= n; i++) {
            seq[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for(int i = 1; i <= n; i++) {
            dp[i] = 0;

            for(int j = 0; j < i; j++) {
                if(seq[j] < seq[i] && dp[i] < seq[i] + dp[j]) {
                    dp[i] = seq[i] + dp[j];
                }
            }
        }

        System.out.println(Arrays.stream(dp)
                                .max()
                                .orElseThrow(NoSuchElementException::new));
    }
}
