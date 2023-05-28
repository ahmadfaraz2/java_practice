import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/*
 * By putting together [import] and [static] we can declare a fully
 *  qualified name of a class and the method or the variable we
 *  are interested in using in the code. This allows us to use the variable
 *  or method directly, without the name of the class it is being
 *  declared in.
 */

public class MathPi{
    public static void main(String[] args){
        System.out.println("PI value = " + PI);

        double result = sqrt(5.0);
        System.out.println("SQRT value = " + result);
    }
}