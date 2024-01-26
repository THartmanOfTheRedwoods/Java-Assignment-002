// Quinn McKay
// Date: 1/26/2024
// Java Assignement 002



public class Time {

    public static void main(String[] args) {

        int hour = 10;
        int minute = 49;
        int second = 35;

        System.out.println("What time is it?");

        System.out.print("Seconds since midnight: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second);

        int dayseconds = 86400;
        int secondssincemidnight = 38975;

        System.out.print("Seconds remaining in the day: ");
        System.out.println(dayseconds - secondssincemidnight);

        double dayseconds2 =  86400.0;
        double secondssincemidnight2 = 38975.0;

        System.out.print("Percentage of the day has passed: ");
        System.out.println(secondssincemidnight2 / dayseconds2 * 100 + "%");

        int hour2 = 11;
        int minute2 = 19;
        int second2 = 47;

        System.out.print("Time in seconds as of step six: ");
        System.out.println(hour2 * 60 * 60 + minute2 * 60 + second2);

        int secondscurrent = 40787;

        System.out.print("Time in seconds spent of this assignment: ");
        System.out.println(secondscurrent - secondssincemidnight);
       



    }
}
