import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
double n = 9999999.0;  //Input is number of sides of a polygon//
        double b = (360/n); //Calculates angle within isosceles triangle//
        double a = (b/2); //Calculates angle once isosceles is split into two right triangles//
        a = Math.toRadians(a); //Converts angle into radians//
        double s = 2*Math.sin(a); //Calculates the length of triangle base//
        double p = n*s;  //Calculates perimeter of polygon//
        double PI = p/2; //Solves for Pi//
                System.out.println(PI);
    }
}
