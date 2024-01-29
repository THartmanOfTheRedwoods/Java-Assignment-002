/**
 *
 * @author Trevor Hartman
 * @author Jennifer Gibson
 * Date 1-28-2024
 *
 * Since Version 1.0
 *
 */
public class Time {

    public static void main(String[] args) {
        int hour = 22;
        int minutes = 16;
        int seconds = 32;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minutes);
        System.out.print(":");
        System.out.print(seconds);
        System.out.println(".");

        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minutes);

        System.out.print("Number of seconds til midnight: ");
        System.out.println((24-hour) * 3600- minutes*60);

        System.out.print("Percentage of Day: ");
        System.out.println(((hour * 60 + minutes)*100)/1440);

        int hour2 = 23;
        int minutes2 = 30;
        int seconds2 = 45;

        System.out.print("Homework Duration: ");
        System.out.println(hour2-hour);
        System.out.print(":");
        System.out.print(minutes2-minutes);
        System.out.print(":");
        System.out.print(seconds2-seconds);
        System.out.println(".");
    }
}
