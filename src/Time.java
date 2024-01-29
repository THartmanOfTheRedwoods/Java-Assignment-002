public class Time {

    public static void main(String[] args) {
        int hour = 21;
        int minute = 10;
        int second = 30;

        int secondsPerHour = 3600;

        int secondsSinceMidnight = hour * secondsPerHour + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsInADay = 24 * secondsPerHour;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

        float percentageOfDayPassed = (float) secondsSinceMidnight / secondsInADay * 100;
        System.out.println("Percentage of day passed: " + percentageOfDayPassed + "%");

        int hourStart = 22;
        int minuteStart = 27;
        int secondStart = 53;

        int elapsedTime = (hour - hourStart) * secondsPerHour + (minute - minuteStart) * 60 + (second - secondStart);
        System.out.println("elapsed time since started working: " + elapsedTime + " seconds");

        System.out.println("Time");
    }

}