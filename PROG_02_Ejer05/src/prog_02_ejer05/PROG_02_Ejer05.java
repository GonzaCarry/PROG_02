package prog_02_ejer05;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class PROG_02_Ejer05 {

     public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    int x, y;
    System.out.print( "Introduzca un número: " );
    x = teclado.nextInt();
    System.out.print( "Introduzca otro número: " );
    y = teclado.nextInt();
    System.out.println("La división de y / x es: "+(y/x));
    // Calculamos el resto de la división para saber si son múltiplos
    if ((y%x)>0)
      System.out.printf("%d no es múltiplo de %d ",x,y);
    else
      System.out.printf("%d es múltiplo de %d ",x,y);
  }
}
