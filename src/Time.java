import java.sql.SQLOutput;

public class Time {
    public static void main(String[] args) {
        int hour=12;
        int minute=24;
        int second=30;
        int totalsecondInAllday = 24 *60*60;
        int hSecSincMid = hour * 60 *60;
        int mSec = minute*60;
        int secondsSincMidnight= hSecSincMid+mSec+second;
        double percentageoftheday= (1.0*secondsSincMidnight/totalsecondInAllday)*100.0;
        minute = 49;
        second= 15;
        int newsecondsSincMidnight=(hour*3600)+(minute*60)+second;
                int elasedSecond = newsecondsSincMidnight-secondsSincMidnight;
        System.out.printf("Second since midnight = %d%n",secondsSincMidnight);
        System.out.printf("Second remaining remaining in all day = %d%n",(totalsecondInAllday-secondsSincMidnight));
        System.out.printf("Percentage of day passed= %.2f%%%n",percentageoftheday);
        System.out.printf("Elapsed seconds for assigment %d%n",elasedSecond);
        int eSeconds = elasedSecond % 60;
        int eMin = elasedSecond/60;
        System.out.printf("Elapsed minute %d and secodn %d",eMin,eSeconds);



}
}
