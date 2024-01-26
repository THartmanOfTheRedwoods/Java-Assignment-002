public class Time {
    public static void main(String[] args) {
        String time = "Number of seconds from midnight: ";
        int hour = 13;
        int minute = 25;
        int second = 30;
        //calculate # of seconds in 13 hours and 25 minutes plus 30 seconds
        int secondsSinceMidnight =(hour * 3600) + (minute * 60) + second;
        //print total seconds since midnight
        System.out.println(time + secondsSinceMidnight + " seconds");
         //calculate seconds in a day = 24 hour*60 minute* 60 seconds
        int secondsInADay = 24 * 60 * 60;
        int secondsRemaining = secondsInADay -secondsSinceMidnight;
        System.out.println( "Seconds remaining in the day: " + secondsRemaining + " seconds");
        // calculate percentage of day that has passed
        double percantageOfDay = ((double) secondsSinceMidnight / secondsInADay) * 100;
        System.out.println("Percentage of the day that has passed: " + percantageOfDay + "%");
        // calculate time that elapsed while working on this exercise
        int newHour = 14;
        int newMinute = 4;
        int newSecond = 15;
        //calculate seconds
        int newSecondsSinceMidnight =(newHour * 3600) + (newMinute * 60) + newSecond;
        System.out.println("Seconds elapsed since start: " + (newSecondsSinceMidnight - secondsSinceMidnight) + " seconds");
    }
}