package graphs._1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int v;
    private static boolean[][] graph;
    private static boolean[] dfsVisited;
    private static boolean[] bfsVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        v = Integer.parseInt(stringTokenizer.nextToken());

        graph = new boolean[n + 1][n + 1];
        dfsVisited = new boolean[n + 1];
        bfsVisited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            graph[a][b] = true;
            graph[b][a] = true;
        }

        dfs(v);
        System.out.println();
        bfs(v);
    }

    private static void dfs(int v) {
        dfsVisited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i <= n; i++) {
            if (graph[v][i] && !dfsVisited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()) {
            int nodeNumber = queue.poll();

            if (!bfsVisited[nodeNumber]) {
                System.out.print(nodeNumber + " ");
            }
            bfsVisited[nodeNumber] = true;

            for (int i = 1; i <= n; i++) {
                if (graph[nodeNumber][i] && !bfsVisited[i]) {
                    queue.add(i);
                }
            }
        }
    }
}
