
/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while (true){
            System.out.println("Please type the number of sides: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n<1){
                break;
            }
            double b = 360.0/n;
            double a = b/2.0;
            double s = 2.0 * Math.toRadians(Math.sin(a));
            double p = n * s;
            double pi = p/2.0;
            System.out.printf("Our Pi estimate is: %.10f%n",pi);
            System.out.println(pi);
        }





    }
}
