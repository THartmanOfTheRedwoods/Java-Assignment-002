import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since Version 1.0
 *
 */

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8; //number of sides on octagon
        double b = 360.0 / n; //Calculate angle B in degrees
        double a = 0.5 * b; //Calculate angle A in degrees
        a = Math.toRadians(a); //convert angle A to radians
        double sinA = Math.sin(a); //Store sin of A
        double s = 2 * sinA; //Calculate length of 1 triangle base s
        double p = n * s; // calculate polygon perimeter
        double pi = p / 2; // estimation of Pi
        System.out.println(pi);

    }
}
