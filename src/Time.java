import java.sql.SQLOutput;

public class Time {
    public static void main(String[] args) {
        int hour = 10;
        int minute = 24;
        int seconds = 30;
        int totalSecondsInADay = 24 * 60 * 60;
        int secondsSinceMidnight = (hour * 3600) + (minute * 60) +seconds;
        int secondsRemaining = totalSecondsInADay - secondsSinceMidnight;
        double percentageOfDay = (1.0*secondsSinceMidnight/ totalSecondsInADay)*100.0;
        minute = 49;
        seconds = 15;
        int newSecondsSinceMidnight = (hour * 3600) + (minute * 60) +seconds;
        int elapSedseconds = newSecondsSinceMidnight - secondsSinceMidnight;

        System.out.printf("Seconds since midnight %d%n", secondsSinceMidnight);
        System.out.printf("Seconds remaining in day %d%n", secondsRemaining);
        System.out.printf("Percentage of day passed %.2f%%%n", percentageOfDay);
        System.out.printf("Elapsed seconds for assignment %d%n", elapSedseconds);
        int eSeconds = elapSedseconds % 60;
        int eMin = elapSedseconds / 60;
        System.out.printf("Elapsed minutes %d and seconds %d%n", eMin, eSeconds);
    }
}
