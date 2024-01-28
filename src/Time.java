public class Time {
    //Doing this without help because I believe I can.
    //Merged int definitions into 1 line during step 4, code worked great

    public static void main(String [] args) {
       // int hour = 17, minute = 43;
       // double second = 13.0;
        int hour = 13, minute = 57;
        double second = 03.0;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(".");
        // Calculate and display the number of seconds since midnight.
        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 60 * 60 + second);
        // Extend the program to calculate and display the number of seconds remaining in the day.
        System.out.print("Number of seconds remaining until midnight: ");
        System.out.println(24 * 60 * 60 - 46803);
        // Calculate and display the percentage of the day that has passed.
        // Adding two extra lines for my own references.
        System.out.print("Number of seconds in a day: ");
        System.out.println(24 * 60 * 60);
        System.out.print("Percent of the day that has passed: ");
        System.out.println(46803.0 * 100 / 86400);
        // Modify the values of hour, minute, and second to reflect the current time. Then, write code to compute the elapsed time since you started working on this exercise.
        System.out.println("Seconds from start to midnight: 25187");
        System.out.println("Seconds from midnight to finish: 46803");
        System.out.print("Seconds since beginning of this exercise: ");
        System.out.println(46803.0 + 25187);
        System.out.print("Minutes since beginning of this exercise: ");
        System.out.println(71990.0 / 60);
        System.out.print("Hours since beginning of this exercise: ");
        System.out.println(1199.8333333333333 / 60);
        System.out.print("Percent of a 24 hr period that has passed: ");
        System.out.println(71990.0 * 100 / 86400);
        //I added a few unnecessary steps, because I'm "getting it" and making use of the practice.
    }
}