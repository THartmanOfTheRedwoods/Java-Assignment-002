public class Time {
  static int hours = 16;
  static int minutes = 25;
  static int seconds = 30;
     public static void main (String[] args) {


     System.out.println(hours+":"+minutes+":"+seconds);
     System.out.println(seconds+(minutes*60)+(hours*3600)+ " seconds since midnight" );
     System.out.println(86400-(seconds+(minutes*60)+(hours*3600))+ " remaining second of the day" );
     //double dhour = 16.0;
     //double dminute = 25.0;
     //double dsecond = 30.0;
     double totalTimeS = (seconds+(minutes*60)+(hours*3600));
     System.out.println(totalTimeS/86400 *100);
         int hours = 17;
         int minutes = 49;
         int seconds = 12;
         int currentTime = (seconds+(minutes*60)+(hours*3600));
         int startingTime = (Time.seconds+(Time.minutes*60)+(Time.hours*3600));
         
         System.out.println((currentTime-startingTime)+ " seconds have past since starting this assignment");
     

}                         }
