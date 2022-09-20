package trie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        Map<String, Boolean> sets = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sets.put(br.readLine(), true);
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (sets.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
