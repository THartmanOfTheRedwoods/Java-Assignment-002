public class Time {
    public static void main(String[] args) {
        int hour, minute, second, calculationsMidnight;
        hour = 1;
        minute = 18;
        second = 25;
        System.out.print(hour);
        System.out.print(':');
        System.out.print(minute);
        System.out.print(':');
        System.out.print(second);
        System.out.println(" AM");
        calculationsMidnight = ((hour * 3600) + (minute * 60) + second);

        System.out.print("Number of seconds since midnight: ");
        System.out.print(calculationsMidnight);
        System.out.println('.');

        String lastMessage;
        int calculation, hoursDay, minutesHours, secondsMinutes;
        hoursDay = 24;
        minutesHours = 60;
        secondsMinutes = 60;
        lastMessage = "Number of seconds remaining in the day: ";
        calculation = ((hoursDay * minutesHours * secondsMinutes) - calculationsMidnight);
        System.out.print(lastMessage);
        System.out.print(calculation);
        System.out.println('.');

        String percentageMessage;
        percentageMessage = "Percentage of the Day that has passed: ";
        double percentage;
        percentage = ((calculationsMidnight/ (24.0 * 60.0 * 60.0)) * 100.0);
        System.out.print(percentageMessage);
        System.out.print(percentage);
        System.out.println(" %.");

        String timeElapsed;
        timeElapsed="Time elapsed since the start of the exercise: ";
        int endHour, endMinute, endSecond, timerH, timerM, timerS, calculationsTime;
        endHour= 2;
        endMinute=13;
        endSecond=58;
        calculationsTime = ((endHour * 3600) + (endMinute * 60) + endSecond);
        timerH=((calculationsTime-calculationsMidnight)/3600);
        timerM=(((calculationsTime-calculationsMidnight)/60)-(60*timerH));
        timerS=((calculationsTime-calculationsMidnight)-(60*timerM)-(3600*timerH));
        System.out.print(timeElapsed);
        System.out.print(timerH);
        System.out.print(" Hour(s) ");
    System.out.print(timerM);
    System.out.print(" Minute(s) ");
    System.out.print(timerS);
    System.out.println(" Second(s).");


    }
    }