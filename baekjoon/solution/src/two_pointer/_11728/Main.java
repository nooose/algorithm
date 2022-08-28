package two_pointer._11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];


        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(a);

        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(b);


        int[] merged = merge(a, b);

        StringBuilder sb = new StringBuilder();
        for (int number : merged) {
            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];

        int aIdx = 0;
        int bIdx = 0;
        int idx = 0;

        while (true) {
            int aValue = a[aIdx];
            int bValue = b[bIdx];

            if (aValue <= bValue) {
                merged[idx] = aValue;
                aIdx++;
            } else {
                merged[idx] = bValue;
                bIdx++;
            }

            idx++;

            if (aIdx == a.length || bIdx == b.length) {
                for (int i = aIdx; i < a.length; i++) {
                    merged[idx] = a[i];
                    idx++;
                }

                for (int i = bIdx; i < b.length; i++) {
                    merged[idx] = b[i];
                    idx++;
                }

                return merged;
            }
        }
    }
}
