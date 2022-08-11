package greedy._2217;

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

        List<Integer> ropes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ropes.add(Integer.parseInt(br.readLine()));
        }

        ropes.sort(Comparator.reverseOrder());

        int weight;
        int maxWeight = 0;
        for (int i = 0; i < ropes.size(); i++) {
            weight = ropes.get(i) * (i + 1);
            if (maxWeight < weight) {
                maxWeight = weight;
            }
        }

        System.out.println(maxWeight);
    }
}
