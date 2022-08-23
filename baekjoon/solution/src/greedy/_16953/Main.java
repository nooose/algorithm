package greedy._16953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int answer = 1;

        while (true) {
            if (a == b) {
                System.out.println(answer);
                return;
            }

            if (a > b) {
                System.out.println(-1);
                return;
            }

            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 10 == 1){
                b /= 10;
            } else {
                System.out.println(-1);
                return;
            }

            answer++;
        }
    }
}
