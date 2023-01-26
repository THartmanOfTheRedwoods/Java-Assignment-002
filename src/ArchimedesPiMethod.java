/**
 *
 * @Author Clay Cordary
 *
 */

import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
int $n = 8;
        double $b = (360.0/$n);
        double $a = ($b * 1/2);
        Math.toRadians($a);
        double $s = Math.sin($a * 2);
        double $p = ($n * $s);
        double $pi = ($p / 2);
        System.out.print($n);
        System.out.print(" ");
        System.out.print($a);
        System.out.print(" ");
        System.out.print($b);
        System.out.print(" ");
        System.out.print($s);
        System.out.print(" ");
        System.out.print($p);
        System.out.print(" ");
        System.out.print($pi);
    }
}
