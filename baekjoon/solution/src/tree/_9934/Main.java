package tree._9934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<Integer> buildingOrderList;
    private static List<Integer>[] answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        answer = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            answer[i] = new ArrayList<>();
        }

        buildingOrderList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        search(0, buildingOrderList.size() - 1, 0);

        // 결과 출력
        for (int i = 0; i < k; i++) {
            for (Integer buildingNumber : answer[i]) {
                System.out.print(buildingNumber + " ");
            }
            System.out.println();
        }
    }

    private static void search(int start, int end, int depth) {
        int mid = (start + end) / 2;

        if (start > end) {
            return;
        }

        answer[depth].add(buildingOrderList.get(mid));

        search(start, mid - 1, depth + 1);
        search(mid + 1, end, depth + 1);
    }
}
