/**
 *
 * @author Jenny Li
 * @since Version 1.0
 * (1/28/24)
 *
 */

public class Time {
    public static void main(String[] args) {

        //int hour = 20;
        //int minute = 10;
        //int second = 46;

        //System.out.print("The number of seconds since midnight is: ");
        //System.out.println(hour * 3600 + minute * 60 + second);

        //System.out.print("The number of seconds remaining in the day are: ");
        //System.out.println(((24-hour) * 3600) + ((60 - minute) * 60) + (60 - second));

        //System.out.print("Fraction of the hour that has passed: ");
        //System.out.println((hour * 100) / 24);

        int hours = 21;
        int minutes = 2;
        int seconds = 50;

        System.out.print("Time since the start of this exercise: ");
        System.out.print((hours - 20) + " hour" +  (50 + minutes) + " minutes" +  (seconds - 46) + " seconds");
    }
}