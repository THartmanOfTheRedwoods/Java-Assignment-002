//Author Kelten
//Date 1/28/24
//Editors note sorry again for the last minute turn in I'll try and be better I'm still ajusting to college sense this is my first semester

package Time;

public class Time {
    public static void main(String[] args) {
        // Step 2: Gives us are time and variables
        int hour = 14; // 2:00 PM
        int minute = 30;
        int second = 0;
        // Step 3: Checks all the numbers and makes it a actual clock
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        // Step 4: Displays and shows the seconds sense Midnight
        int secondsInADay = 24 * 3600;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;
        System.out.println("Remaining seconds in the day: " + secondsRemaining);
        // Step 5: Calculate and display the percentage of the day that has passed
        double percentageOfDayPassed = ((double) secondsSinceMidnight / secondsInADay) * 100;
        System.out.println("Percentage of the day left: " + percentageOfDayPassed + "%");
        // Step 6: Changes values to show the time
        int currentHour = 16; // Assuming it's 4:00 PM now
        int currentMinute = 45;
        int currentSecond = 30;
        // Calculate and display the time
        int elapsedSeconds = (currentHour - hour) * 3600 + (currentMinute - minute) * 60 + (currentSecond - second);
        System.out.println("Elapsed time since starting: " + elapsedSeconds + " seconds");
    }
}