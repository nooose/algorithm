package greedy._1758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> tips = new ArrayList<>();
        long answer = 0;

        for (int i = 0; i < n; i++) {
            tips.add(Integer.parseInt(br.readLine()));
        }

        tips.sort(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int tip = tips.get(i) - i;
            answer += Math.max(tip, 0);
        }

        System.out.println(answer);
    }
}
