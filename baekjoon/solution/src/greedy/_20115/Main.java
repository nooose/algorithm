package greedy._20115;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int[] drink = new int[n];
        for (int i = 0; i < n; i++) {
            drink[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(drink);

        double answer = drink[n - 1];
        for (int i = 0; i < n - 1; i++) {
            answer += drink[i] / 2.0;
        }

        System.out.println(answer);
    }
}
