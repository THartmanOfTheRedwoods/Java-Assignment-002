import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        int n = 8;
        int B = 360/n;
        double A = 0.5*B;
        int h = 1;
        double s = 2*h* Math.sin(Math.toRadians(A));
        double p = s*n;
        double PI = p/2*h;
        System.out.println(PI);
    }
}
