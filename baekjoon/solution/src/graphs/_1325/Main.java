package graphs._1325;
import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static int[] count;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        graph = new ArrayList[n + 1];
        count = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            graph[b].add(a);
        }

        for (int i = 1; i < n + 1; i++) {
            bfs(i);
        }

        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            max = Math.max(count[i], max);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if (max == count[i]) {
                result.append(i).append(" ");
            }
        }

        System.out.println(result);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int number = queue.poll();

            for (int linkedNodeNumber : graph[number]) {
                if (!visited[linkedNodeNumber]) {
                    visited[linkedNodeNumber] = true;
                    count[start]++;
                    queue.add(linkedNodeNumber);
                }
            }
        }
    }
}
