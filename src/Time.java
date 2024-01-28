public class Time {
    public static void main(String[] args) {
        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        int hour = 19;
        int minute = 10;
        int seconds = 18;
        System.out.println("The current time is " + hour + ":" + minute + ":" + seconds + ".");

        int secondsSinceMidnight = hour * 3600 + minute * 60 + seconds;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsInADay = 24 * 3600;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

 double percentPassed = (secondsSinceMidnight * 100.0) / secondsInADay;
 System.out.println("Percentage of the day passed: " + percentPassed + "%");

 int currentHour = 20;
 int currentMinute = 14;
 int currentSecond = 15;
 int elapsedTime = ((currentHour - hour) * 3600) + ((currentMinute - minute) * 60) + (currentSecond - seconds);
 System.out.println("Elapsed time since starting this exercise: " + elapsedTime + " seconds");

 int elapsedMinutes = elapsedTime / 60;
 int elapsedHours = elapsedMinutes / 60;
 elapsedMinutes %= 60;
 elapsedTime %= 60;
 System.out.println("Total time elapsed: " + elapsedHours + " hours, "  + elapsedMinutes + " minutes, " + elapsedTime + " seconds. ");
    }
}