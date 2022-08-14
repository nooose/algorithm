package greedy._11508;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> products = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        for (int i = 0; i < n; i++) {
            products.add(Integer.parseInt(br.readLine()));
        }

        products.sort(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) {
                continue;
            }
            answer += products.get(i);
        }

        System.out.println(answer);
    }
}
