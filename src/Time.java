public class Time {
    public static void main(String[] args) {
        int currentHour = 16;
        int currentMinute = 30;
        int currentSecond = 45;

        int secondsSinceMidnight = currentHour * 3600 + currentMinute * 60 + currentSecond;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int totalSecondsInDay = 24 * 3600;
        int secondsRemaining = totalSecondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in day: " + secondsRemaining);

    double percentagePassed = (secondsSinceMidnight * 100.0) / totalSecondsInDay;
    System.out.println("Percentage of the day passed: " + percentagePassed + "%");

    currentHour = 18;
    currentMinute =10;
    currentSecond = 30;

    int elapsedTime = (currentHour - 16) * 3600 + (currentMinute - 30) * 60 + (currentSecond - 45);
    System.out.println("Time since starting the Assignment: " + elapsedTime + " seconds");

    int elapsedMinutes = elapsedTime / 60;
    int elapsedHours = elapsedMinutes / 60;
    elapsedMinutes %= 60;

    System.out.println("Total elapsed time: " + elapsedHours + " hours, " + elapsedMinutes + " minutes, " + elapsedTime + " seconds.");
    }
}
