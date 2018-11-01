package prog_02_ejer08;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class PROG_02_Ejer08 {

    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    float x,y;
    System.out.print( "Introduzca un número: " );
    x = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    y = teclado.nextInt();
    System.out.printf("\nx + y = %.1f",(x+y));
    System.out.printf("\nx - y = %.1f",(x-y));
    System.out.printf("\nx * y = %.1f",(x*y));
    System.out.printf("\nx / y = %.1f",(x/y));
    System.out.printf("\nx ^ 2 = %.1f",Math.pow(x, 2));
    System.out.printf("\n√x = %.1f",Math.pow(x,0.5));
  }  
}
