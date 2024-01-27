/**
 *
 * @author Molly Severdia
 *
 */

public class Time {

    public static void main(String[] args) {
        int hour, minute, second;
        hour = 18;
        minute = 50;
        second = 17;

        System.out.print("The time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(".");

// Calculate how many seconds have passed since midnight
        int secondsSinceMidnight = hour*3600 + minute*60 + second;
        System.out.print("It has been approximately ");
        System.out.print(secondsSinceMidnight);
        System.out.println(" seconds since midnight.");

// Calculate how many seconds remain until midnight
        int secondsRemaining = 24*3600 - secondsSinceMidnight;
        System.out.print("There are approximately ");
        System.out.print(secondsRemaining);
        System.out.println(" seconds remaining until midnight.");

// Calculate what percentage of the day has passed
        System.out.print("Approximately ");
        System.out.print(secondsSinceMidnight*100 / 86400);
        System.out.println("% of the day has passed.");

        int newHour, newMinute, newSecond, timeElapsed;
        newHour = 19;
        newMinute = 19;
        newSecond = 36;

        System.out.print("The time is now ");
        System.out.print(newHour);
        System.out.print(":");
        System.out.print(newMinute);
        System.out.print(":");
        System.out.print(newSecond);
        System.out.println(".");

// Calculate how much time has elapsed since beginning assignment
        timeElapsed = (newHour*3600 + newMinute*60 + newSecond) - secondsSinceMidnight;

        System.out.print("Approximately ");
        System.out.print(timeElapsed);
        System.out.println(" seconds have elapsed since starting this exercise.");
    }

}