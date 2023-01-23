/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("Enter number of polygon sides."); // Output question to user.
        Scanner sc = new Scanner(System.in); // User input, Scanner type variable named "sc"
        int n = sc.nextInt(); // n = number of polygon sides = sc = user input
        double b = 360.0/n; // number of sides of polygon divided into 360 degree of circle = angle of triangle
        double a = b/2; // angle of triangle side divided in 1/2 = a
        double s = 2*Math.sin(Math.toRadians(a)); // s = a put through sin function than multiplied by 2, converted to radians = s
        double p = n*s; // p = polygon perimeter = number of polygon sides multiplied by (s = polygon triangle area?)
        double pi = p/2; // pi = polygon perimeter / 2
        System.out.printf("PI estimate is: %f", pi); // system out message variable pi in format floating point


    }
}
