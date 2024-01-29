public class Time {

    public static void main(String[] args) {

        int hour;
        int minute;
        int second;
        int pastMidnight;
        int secondsInDay;
        secondsInDay = 24 * 60 * 60;
        hour = 16;
        minute = 48;
        second = 30;
        double seconds = second;
        pastMidnight = hour * 60 * 60 + second;
        int oldHour;
        int oldMinute;
        int oldSecond;
        oldSecond = second;
        oldHour = hour;
        oldMinute = minute;
        hour = 18;
        minute = 17;
        second = 12;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.print("Number of seconds since midnight is ");
        System.out.println(pastMidnight);
        System.out.print("Number of seconds remaining until midnight is ");
        System.out.println(secondsInDay - pastMidnight);
        System.out.print("Percent of day completed ");
        System.out.println((pastMidnight * 100.0) / secondsInDay);
        System.out.println("Total time working on this ");
        System.out.print(hour - oldHour);
        System.out.print(":");
        System.out.print(minute + 60 - oldMinute);
        System.out.print(":");
        System.out.println(second + 60 - oldSecond);
    }
}