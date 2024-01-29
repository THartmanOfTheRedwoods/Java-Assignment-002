import static java.lang.System.nanoTime;

public class Time {
    public static void main(String[] args) {
        System.out.println("Hello, This is a small working program");
        int starthour = 15;
        int startminute = 23;
        int startsecond = 45;
        System.out.print("The current start time is ");
        System.out.print(starthour);
        System.out.print(":");
        System.out.print(startminute);
        System.out.println(".");
        int nighthour = 7;
        int nightminute = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(nighthour * 60 + nightminute);
        int dayhour = 14;
        int dayminute = 59;
        System.out.print("Number of minutes remaining in the day: ");
        System.out.println(dayhour * 60 + dayminute);
        System.out.print("Percent of the day that has passed: ");
        System.out.println(dayminute + dayhour * 100 / 60 );
        int Currenthour = 16;
        int Currentminute = 52;
        int Currentsecond = 32;
        System.out.print("The current time worked: ");
        System.out.print(Currenthour);
        System.out.print(":");
        System.out.print(Currentminute);
        System.out.println(".");
        int Timeseconds = 5477;
        System.out.print("Time elapsed since I started working on this exercise:");
        System.out.print(Timeseconds);
        System.out.println(".");


    }
}

