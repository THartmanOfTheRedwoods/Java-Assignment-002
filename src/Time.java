public class Time {
    public static void main(String[] args) {

        int hour = 12;
        long minute = 52;
        long seconds = hour * 60 * 60;
        minute = minute*60;
        long day = 24 * 60 * 60 - (seconds+minute);
        System.out.println("Number of second since midnight: "+ (seconds + minute));
        System.out.println("number of seconds remaining in the day:"+ day);
        System.out.print("Percent of the hour that has passed: "+(minute / 60)+" %");
    }
}
