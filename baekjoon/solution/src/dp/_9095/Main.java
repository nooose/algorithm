package dp._9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        List<Integer> dp = new ArrayList<>();
        dp.add(1); // 1
        // 1
        dp.add(2); // 2
        // 1 + 1
        // 2
        dp.add(4); // 3
        // 1 + 1 + 1
        // 1 + 2
        // 2 + 1
        // 3

        for (int i = 3; i < 11; i++) {
            dp.add(dp.get(i - 1) + dp.get(i - 2) + dp.get(i - 3));
        }

        for (int i = 0; i < t; i++) {
            System.out.println(dp.get(Integer.parseInt(br.readLine()) - 1));
        }
    }
}
