/**
 *
 * @author Trevor Hartman
 * @author Alexei Iachkov
 *
 * @version 1.0
 *
 * @date 1-19-24
 *
 */

public class Time {

        public static void main(String[] args) {
                int hour = 13;
                int minute = 26;
                int second = 30;

                System.out.print("The current time is ");
                System.out.print(hour);
                System.out.print(":");
                System.out.print(minute);
                System.out.print(":");
                System.out.print(second);
                System.out.println(".");

                int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
                System.out.print("Number of seconds since midnight: ");
                System.out.println(secondsSinceMidnight);

                int secondsInDay = 24 * 3600;
                int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;
                System.out.print("Number of seconds remaining in the day: ");
                System.out.println(secondsRemainingInDay);

                int percentDayPassed = 100 * secondsSinceMidnight / secondsInDay;
                System.out.print("Percent of the day that has passed: ");
                System.out.println(percentDayPassed);

                int updatedHour = 22;
                int updatedMinute = 46;
                int updatedSecond = 12;

                int updatedSecondsSinceMidnight = updatedHour * 3600 + updatedMinute * 60 + updatedSecond;
                int elpasedTime = updatedSecondsSinceMidnight - secondsSinceMidnight;
                System.out.print("Number of seconds since start of assignment: ");
                System.out.println(elpasedTime);




        }

}
