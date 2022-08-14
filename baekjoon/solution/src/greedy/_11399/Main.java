package greedy._11399;

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

        String[] orders = br.readLine().split(" ");
        List<Integer> orderList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            orderList.add(Integer.parseInt(orders[i]));
        }

        orderList.sort(Comparator.naturalOrder());

        int sum = 0;
        int result = 0;
        for (Integer order : orderList) {
            sum += order;
            result += sum;
        }

        System.out.println(result);
    }
}
