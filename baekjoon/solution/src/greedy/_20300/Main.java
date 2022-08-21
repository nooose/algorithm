package greedy._20300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        List<Long> losses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            losses.add(Long.parseLong(stringTokenizer.nextToken()));
        }

        losses.sort(Comparator.naturalOrder());

        long answer = 0;

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer = Math.max(answer , losses.get(i) + losses.get(n - 1 - i));
            }
        } else {
            answer = losses.get(n - 1);
            for (int i = 0; i < (n - 1) / 2; i++) {
                answer = Math.max(answer , losses.get(i) + losses.get(n - 2 - i));
            }
        }

        System.out.println(answer);
    }
}
