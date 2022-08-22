package greedy._1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final int INIT_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] expressions = br.readLine().split("-");

        int answer = INIT_VALUE;
        for (String expression : expressions) {
            int sum = 0;

            for (String value : expression.split("\\+")) {
                sum += Integer.parseInt(value);
            }

            if (answer == INIT_VALUE) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
