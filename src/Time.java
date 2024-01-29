import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {

        int hour = 13;
        int minute = 43;
        int second = 45;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;

        int secondsInADay = 24 * 3600;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;

        double percentagePassed = (double) secondsSinceMidnight / secondsInADay * 100;

        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);
        System.out.println("Number of seconds remaining in the day: " + secondsRemaining);
        System.out.printf("Percentage of the day that has passed: %.2f%%\n", percentagePassed);

        LocalTime currentTime = LocalTime.now();
        hour = currentTime.getHour();
        minute = currentTime.getMinute();
        second = currentTime.getSecond();

        int elapsedSeconds = hour * 3600 + minute + second - secondsSinceMidnight;

        System.out.println("\nElapsed time since starting the exercise: " + elapsedSeconds + " seconds");

    }
}
