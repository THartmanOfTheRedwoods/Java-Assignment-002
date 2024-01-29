public class Time {
    public static void main(String[] args) {
        System.out.println("Hello World!\n");

        int hour;
        int minute;
        int second;

        // Following the example program in Section 2.4 of your book,
        // define variables named hour, minute, and second.
        // Assign values that approximate the current time.
        // Use a 24-hour clock (e.g., set hour to 14 for 2:00 PM).

        hour = 18;
        minute = 43;
        second = 54;

        int currentTime = (hour * 3600) + (minute * 60) + second;

        //Implement the program to calculate and display the number of seconds since midnight.
        System.out.println("The number of seconds since midnight is: " + currentTime);

        //Extend the program to calculate and display the number of seconds remaining in the day.
        int secondsInADay = 86400;

        int secondsRemaining = secondsInADay - currentTime;


        System.out.println("The seconds remaining in the day are: " + secondsRemaining);

        System.out.println("Total seconds in a day = " + (secondsRemaining + currentTime));

        //Further enhance the program to calculate and display the percentage of the day that has passed.
        // Be cautious when dealing with percentages using integers; consider using floating-point numbers.

        double percentagePassed = (double) currentTime / secondsInADay * 100;

        System.out.println("\nThe percentage of the day since midnight is: " + percentagePassed + "%");

        //Modify the values of hour, minute, and second to reflect the current time.
        // Then, write code to compute the elapsed time since you started working on this exercise.

        hour = 19;
        minute = 23;
        second = 27;

        int currentTimeNow = (hour * 3600) + (minute * 60) + second;


        System.out.println("\n" +
                "Time, in seconds, worked on this program: " + (currentTimeNow - currentTime) + " = 39.55 mins.");

    }
}