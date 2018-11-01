package prog_02_ejer07;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class PROG_02_Ejer07 {

    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    float C1,C2;
    System.out.print( "Introduzca un número: " );
    C1 = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    C2 = teclado.nextInt();
    System.out.println("el resultado de la dividion es: "+(C2/C1));
    System.out.printf("La ecuación %.1fx + %.1f = 0 es: %f",C1,C2,(-(C2/C1)));
  }   
}
