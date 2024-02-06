public class Time {
    public static void main(String[] args) {
        int hour = 9;
                int minute = 10;
        int second = 45;
        int nSecSMid = hour*3600 + minute * 60 + second;
        System.out.println("The number of seconds since midnight:" + nSecSMid);
        int secDay = 24 * 3600;
        int secondsRemain = secDay - nSecSMid;
        System.out.println("The number of seconds that remain in the day:" + secondsRemain);
double percentage = (1.0 * nSecSMid / secDay) * 100;
String template = "%.2f%%%n";
String formatedPercent = String.format(template, percentage);
System.out.print(formatedPercent);
    }
}
