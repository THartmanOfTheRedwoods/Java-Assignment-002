import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Colton Simpson
 *
 * @since Version 1.0
 *
 */
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8;
        double B = 360.0 / n;
        double A = (1.0 / 2.0) * B;
         A = Math.toRadians(A);
        double s = 2.0 * Math.sin(A);
       double p = (n*s);
       double PI = p / 2.0;
        System.out.println(PI);
    }
}
