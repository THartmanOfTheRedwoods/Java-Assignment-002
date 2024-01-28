
public class Time {
    public static void main(String[] args) {
       int hour = 10;
       int minute = 39;
       int second = 43;
       System.out.print("Number of seconds since midnight ");
       System.out.println(second+hour*3600+minute*60);
       int secondssincemidnight = (second + minute * 60 + hour * 3600);
       int secondsinaday = (24 * 3600);
       int secondsleft = (secondsinaday-secondssincemidnight);
       System.out.print("seconds left until midnight ");
       System.out.println(secondsleft);
       double percentofday = (double) secondssincemidnight/secondsinaday*100;
       System.out.print("Percentage of the day that has passed ");
       System.out.println(percentofday);
       int hour1 = 11;
       int minute1 = 44;
       int second1 = 55;
       System.out.print("Time spent on this project ");
       System.out.print(hour1-hour);
       System.out.print(" Hours ");
       System.out.print(minute1-minute);
       System.out.print(" Minutes and ");
       System.out.print(second1-second);
       System.out.println(" Seconds ");
    }
}