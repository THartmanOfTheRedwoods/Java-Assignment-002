public class Time {
    public static void main(String[] args) {
        int hour = 20;
        int minute = 44;
        int second = 22;
        int midnight = 24;
        float secondInDay = 86400;
        int fromMidnight = hour*3600 + minute*60 + second;
        int untilMidnight = midnight*3600 - fromMidnight;
        float percentOfDay = fromMidnight/secondInDay;
        System.out.println(fromMidnight + " seconds from midnight." + "\n" + untilMidnight + " seconds until midnight."
                + "\n" + percentOfDay + " percent of the day has passed.");
        // modified values
        System.out.println(((hour + 1)*3600 + (minute - 39)*60 + second + 20) - (hour*3600 + minute*60 + second) +
                " seconds have passed since I have started this assignment.");
    }
}
