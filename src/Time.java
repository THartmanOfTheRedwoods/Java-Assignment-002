public class Time {
    public static void main(String[] args) {

        String time;
        int hour, minute, second;

        hour = 10;
        minute = 36;
        second = 52;

        time = (hour + ":" + minute + ":" + second);

        int secondsSinceMidnight = (hour * 3600 + minute * 60 + second);
        //No extra parenthesis needed since Java follows PEMDAS.

        int secondsRemainingToday = (86400 - secondsSinceMidnight);
        //86400 is the total seconds in a day.

        double percentageMath = ((secondsSinceMidnight/86400.0)*100);
        int percentageDayPassed = (int) Math.round(percentageMath);
        //Used a double for the math, then rounded to an int for a readable percentage.

        hour = 11;
        minute = 1;
        second = 24;
        //Time as of writing this line. Seconds are guessed.

        int secondsSinceMidnight2 = (hour * 3600 + minute * 60 + second);
        int secondsSinceStartOfAssignment = (secondsSinceMidnight2 - secondsSinceMidnight);
        int minutesSinceStartOfAssignment = Math.floorDiv(secondsSinceStartOfAssignment,60);
        int remainingSecondsSinceStartOfAssignment = (secondsSinceStartOfAssignment - minutesSinceStartOfAssignment * 60);
        //Used floor division to get the full minutes from seconds, then used the difference for the remaining seconds.

        System.out.print("The current time is ");
        System.out.print(time);
        System.out.println(".");

        System.out.print("Number of seconds since midnight: ");
        System.out.println(secondsSinceMidnight);

        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(secondsRemainingToday);

        System.out.print("The percentage of the day that has passed: ");
        System.out.print(percentageDayPassed);
        System.out.println("%");

        System.out.print("It has been ");
        System.out.print(minutesSinceStartOfAssignment);
        System.out.print(" minutes and ");
        System.out.print(remainingSecondsSinceStartOfAssignment);
        System.out.println(" seconds since I have started this assignment.");
        //I would normally use formatted print statements, but since this is based on Chapter 2 I used the method from the chapter.
    }
}