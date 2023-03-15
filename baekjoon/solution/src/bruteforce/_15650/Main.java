package bruteforce._15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] selected;
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        N = scanner.nextInt();
        M = scanner.nextInt();
        selected = new int[M + 1];

        recursive(1);
        System.out.println(stringBuilder.toString());
    }

    private static void recursive(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                stringBuilder.append(selected[i]).append(' ');
            }
            stringBuilder.append('\n');
            return;
        }

        for (int candidate = selected[k - 1] + 1; candidate <= N; candidate++) {
            selected[k] = candidate;
            recursive(k + 1);
            selected[k] = 0;
        }
    }

    static class FastReader {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        public FastReader() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        String next() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }
    }
}
