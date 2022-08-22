package greedy._1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final int START = 0;
    public static final int END = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] time = br.readLine().split(" ");
            times.add(new Time(Integer.parseInt(time[START]), Integer.parseInt(time[END])));
        }

        Collections.sort(times);

        int answer = 0;
        int prevEndTime = -1;

        for (Time time : times) {
            if (prevEndTime <= time.getStart()) {
                prevEndTime = time.getEnd();
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static class Time implements Comparable<Time> {
        private final int start;
        private final int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public int compareTo(Time other) {
            if (this.end == other.getEnd()) {
                return this.start - other.getStart();
            }

            return this.end - other.getEnd();
        }
    }
}
