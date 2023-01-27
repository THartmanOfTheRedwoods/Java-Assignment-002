import java.util.Scanner;

/**
 *
 * @author crazyne55
 *
 * @since Version 1.0
 *
 */
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8;
        double B = 360.0 / n;
        double A = 0.5 * B; // (1.0 / 2.0) -> 0.5
        double s = 2.0 * Math.sin(Math.toRadians(A));
        double p = n * s;
        double PI = p / 2.0;
        System.out.println("Approximation of Pi: " + PI);
    }
}
