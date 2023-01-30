import java.util.Objects;
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\nWelcome!\n\nThis is a tool to estimate pi based on a polygon inscribed in a circle.\n\nPlease type a number for n (the number of sides) and press [enter]\n");
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double B = 360/n;
        double s = Math.toRadians((0.5) * B);
        s = Math.sin(s) * 2.0;
        double Pi = (n * s) / 2.0;
        System.out.println("\nYou inputted " + n + " for n \n\nYour estimation for Pi is " + Pi + "\nJava's estimation is " + Math.PI + "\n\nTry again? (Y/N)\n");
        goAgain();
        }
    static void goAgain() {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (Objects.equals(choice, "Y") || Objects.equals(choice, "y")  ) {
            main(null);
    }
        else {
            System.out.println("now exiting...\n~~~~~~~~~~~~~~~~~~~~~~~");

        }
    }
}
