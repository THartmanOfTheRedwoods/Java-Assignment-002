// Created by: Austin Barnett
// Version: 1.0
// Date: 1/25/2024

public class Time {
   static int hour = 15;
    static int minute = 31;
    static int second = 55;
    static int sinceMidnight = hour + 3600 + minute * 60 + second;
    static int secondsDay = 24 * 3600;
    static int secondsRemain = secondsDay - sinceMidnight;
    static double percentPassed = (double) sinceMidnight / secondsDay * 1000;

    static int nowHour = 16;
    static int nowMinute = 4;
    static int nowSecond = 30;
    static int timePassed = (nowHour * 3600 + nowMinute * 60 + nowSecond) - (hour * 3600 + minute * 60 + second);

    public static void main(String[] args) {
System.out.println("Second since midnight: " + sinceMidnight);
System.out.println("Seconds remaining in the day: " + secondsRemain);
System.out.println("Percentage of the day that has passed: " + percentPassed + "%");
System.out.println("Seconds Passed since beginning assignment: " + timePassed);




    }

}

