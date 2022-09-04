package dp._11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);

        for (int i = 2; i < n; i++) {
            dp.add((dp.get(i - 1) + dp.get(i - 2)) % 10007);
        }

        System.out.println(dp.get(n - 1));
    }
}
