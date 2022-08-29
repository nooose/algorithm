package data_structures._1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        StringBuilder answer = new StringBuilder();
        answer.append("<");

        int index = 0;
        for (int i = 0; i < n; i++) {
            index = (index + k - 1) % (numbers.size());
            answer.append(numbers.remove(index));

            if (i == n - 1) {
                answer.append(">");
            } else {
                answer.append(", ");
            }
        }

        System.out.println(answer);
    }
}
