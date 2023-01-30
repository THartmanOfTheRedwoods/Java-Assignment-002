/**
 * @author Trevor Hartman
 * @author Willard Bowles
 * @since Version 1.0
 *
 *
 *
 */
public class ArchimedesPiMethod{
    public static void main(String[] args) {

        double sides = 25.0;
        double angleB = 360.0/sides;
        double angleA = angleB/2 ;
        double radianA = Math.toRadians(angleA);
        double sinA = Math.sin(radianA);
        double base = sinA * 2;
        double length = sides * base;
        double Pi = length/2;
        //Hopefully this is satisfactory. I am starting to get a hang of some of the basic concepts.
        System.out.println(Pi);

    }
}
