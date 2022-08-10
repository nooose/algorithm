package greedy._1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int AAAA = 0;
    private static final int BB = 1;
    private static final String[] POLYOMINO = {"AAAA", "BB"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String boards = br.readLine();

        boards = boards.replace("XXXX", POLYOMINO[AAAA]);
        boards = boards.replace("XX", POLYOMINO[BB]);

        System.out.println(boards.contains("X") ? -1 : boards);
    }
}
