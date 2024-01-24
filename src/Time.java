/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * January 23, 2024
 *
 */
public class Time {
    static double hour = 21.00;
    static double minute = 0.01;
    static double second = 0.0012;

    public static void main(String[] args) {
        double hourMultipliedBySixty = hour*60; //I multiplied the hour variable by 60 to convert it to minutes
        double hourSolutionPlusMinute = hourMultipliedBySixty+minute; //Added the minute variable to the hours converted to minutes
                double hourPlusMinutesTimesSixty = hourSolutionPlusMinute*60; //Multiplied the total by 60 to convert it to seconds
                double hourPlusMinuteTimesSixtyPlusSecond = hourPlusMinutesTimesSixty+second; //Added the second variable to the total
        System.out.println(hourPlusMinuteTimesSixtyPlusSecond+" seconds since midnight");
        double secondsLeft = 86400-hourPlusMinuteTimesSixtyPlusSecond; //Subtracted the total number of seconds in a day from the seconds that had passed since midnight
        System.out.println(secondsLeft+" seconds left in the day");
        double percentDayPassed = hourPlusMinuteTimesSixtyPlusSecond/86400;//divided the seconds since midnight by the total seconds in a day to get the percentage
        double roundedPercentDayPassed = percentDayPassed*100;
        System.out.println(roundedPercentDayPassed+" % of the day has passed");
        double hour = 22.00; //updated variables to current time
        double minute = 0.19;
        double second = 0.0020;
        double currentTotalMinusOldTotal = (hour+minute+second)-hourPlusMinuteTimesSixtyPlusSecond/3600; // Added up all updated variables and then subtracted by the seconds since midnight divided by 3600 to convert into hours
        System.out.println(currentTotalMinusOldTotal+" hours since I began the assignment");

    }
}
