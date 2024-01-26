public class Time {
    public static void main(String[] args) {

        // Stating variables
        double hour = 16;
        double minute = 30;
        double second = 41;

        // Number of seconds since midnight
        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour * 3600) + (minute * 60) + second);

        // Seconds remaining in the day
        System.out.print("Seconds remaining in the day are: ");
        System.out.println(86400 - ((hour * 3600) + (minute * 60) + second));

        // Percentage of the day
        System.out.print("Percentage of the day that has passed is ");
        System.out.println(((hour * 3600) + (minute * 60) + second) * 100 / 86400 + "%");

        // Seconds since starting exercise
        System.out.print("How many seconds that have passed since I started this exercise: ");
        System.out.println(((hour * 3600) + (minute * 60) + second) - 57291);

    }
}
