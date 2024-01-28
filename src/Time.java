/**
 *
 * @author Tyler Snyder
 */
public class Time {
    public static void main(String[] args) {
        int hour = 10;
        int minute = 29;
        int second = 43;
        //Define variables and assign values that approximate current time.

        int minSinceMidnight = (hour * 60 + minute);
        int secSinceMidnight = (minSinceMidnight * 60 + second);
        System.out.printf("Number of seconds since midnight: %d\n", secSinceMidnight);
        //Calculate and display number of seconds since midnight.

        int secInDay = 86400;
        int secRemainingInDay = (secInDay - secSinceMidnight);
        System.out.printf("There are %d seconds remaining in the day\n", secRemainingInDay);
        //Calculate and display number of seconds remaining in the day.

        double percentDayPast =( (double)secSinceMidnight / (double)secInDay ) * 100;
        System.out.printf("%f percent of the day has past\n", percentDayPast);
        //Calculate and display percent of the day that has past.

        hour = 11;
        minute = 22;
        second = 30;
        int currentTime = (hour * 60 + minute) * 60 + second;
        int timeElapsedMinutes = (currentTime - secSinceMidnight) / 60;
        System.out.printf("%d minutes have elapsed since starting this exercise\n", timeElapsedMinutes);
        //Modify variable values to reflect current time at end of exercise and calculate time elapsed.
    }
}
