import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        double n = 888888888888888888888.0;

       double pie = (n*(2*(Math.sin(Math.toRadians((360/n)/2)))))/2;
       System.out.println(pie);
    }
}
