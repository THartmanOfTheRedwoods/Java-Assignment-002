public class Time {
    public static void main(String[] args) {
        int hour = 14; // You can change this value to the current hour.
        int minute = 30; // You can change this value to the current minute.
        int second = 45; // You can change this value to the current second.

        int minutepast = 14;

        int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
        int secondsRemainingInDay = (24 * 3600) - secondsSinceMidnight;
        int timeElapsed = (minute - minutepast);

        double percentageOfDayPassed = (double) secondsSinceMidnight / (secondsSinceMidnight + secondsRemainingInDay) * 100;

        System.out.println("The number of seconds since midnight is: " + secondsSinceMidnight);
        System.out.println("The number of seconds remaining in the day is: " + secondsRemainingInDay);
        System.out.println("The percentage of the day that has passed is: " + percentageOfDayPassed + "%");
        System.out.println("Minutes since starting this project: " + timeElapsed);
    }
}