package greedy._20365;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String color = br.readLine();

        String[] red = color.split("B+");
        String[] blue = color.split("R+");

        int redCount = getStringCountFromArr(red);
        int blueCount = getStringCountFromArr(blue);

        System.out.println(Math.min(redCount, blueCount) + 1);
    }

    private static int getStringCountFromArr(String[] arr) {
        int count = 0;

        for (String str : arr) {
            if (str.length() > 0) {
                count++;
            }
        }
        return count;
    }
}
