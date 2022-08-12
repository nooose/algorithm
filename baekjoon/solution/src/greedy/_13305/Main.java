package greedy._13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] distance = new long[n - 1];
        long[] fuelCost = new long[n];

        String[] inputDistance = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Integer.parseInt(inputDistance[i]);
        }

        String[] inputFuelCost = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            fuelCost[i] = Integer.parseInt(inputFuelCost[i]);
        }


        long prevFuelCost = fuelCost[0];
        for (int i = 1; i < n - 1; i++) {
            if (prevFuelCost > fuelCost[i]) {
                prevFuelCost = fuelCost[i];
            } else {
                fuelCost[i] = prevFuelCost;
            }
        }

        long resultCost = fuelCost[0] * distance[0];
        for (int i = 1; i < n - 1; i++) {
            resultCost += fuelCost[i] * distance[i];
        }

        System.out.println(resultCost);
    }
}
