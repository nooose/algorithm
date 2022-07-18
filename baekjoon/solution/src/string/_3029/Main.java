package string._3029;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 12:34:56
        // 14:36:22
        Scanner scanner = new Scanner(System.in);

        String inputNowTime = scanner.nextLine();
        String inputThrowTime = scanner.nextLine();

        Time nowTime = new Time(inputNowTime);
        Time throwTime = new Time(inputThrowTime);
        Time resultTime = getResultTime(nowTime, throwTime);;

        System.out.println(resultTime);
    }

    private static Time getResultTime(Time nowTime, Time throwTime) {
        if (nowTime.equals(throwTime)) {
            return new Time(24, 0, 0);
        }


        int resultSecond = throwTime.second - nowTime.second;
        int resultMinute = throwTime.minute - nowTime.minute;
        int resultHour = throwTime.hour - nowTime.hour;

        if (resultSecond < 0) {
            resultSecond += 60;
            resultMinute -= 1;
        }

        if (resultMinute < 0) {
            resultMinute += 60;
            resultHour -= 1;
        }

        if (resultHour < 0) {
            resultHour += 24;
        }

        return new Time(resultHour, resultMinute, resultSecond);
    }

    public static class Time {
        private int hour;
        private int minute;
        private int second;

        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public Time(String time) {
            String[] splitTime = time.split(":");
            hour = Integer.parseInt(splitTime[0]);
            minute = Integer.parseInt(splitTime[1]);
            second = Integer.parseInt(splitTime[2]);
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Time)) return false;
            Time time = (Time) o;
            return hour == time.hour && minute == time.minute && second == time.second;
        }
    }

}