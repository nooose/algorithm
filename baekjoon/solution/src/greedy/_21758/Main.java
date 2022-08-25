package greedy._21758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] honeyBucket = new int[n + 1];
        long[] sum = new long[n + 1];

        long answer = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= n; i++) {
            honeyBucket[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum[i] += honeyBucket[i] + sum[i - 1];
        }

        // b ... b ... d
        for (int i = 2; i < n; i++) {
            answer = Math.max(answer, sum[n] - honeyBucket[1] - honeyBucket[i] + sum[n] - sum[i]);
        }
        // d ... b ... b
        for (int i = 2; i < n; i++) {
            answer = Math.max(answer, sum[n] - honeyBucket[n] - honeyBucket[i] + sum[i - 1]);
        }

        // b ... d ... b
        for (int i = 2; i < n; i++) {
            answer = Math.max(answer, sum[i] - honeyBucket[1] + sum[n] - sum[i - 1] - honeyBucket[n]);
        }

        System.out.println(answer);
    }
}
