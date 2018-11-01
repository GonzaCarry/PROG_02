package prog_02_ejer09;

import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class PROG_02_Ejer09 {

    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    int i,x=0;
    String NumTexto;
    while (x<10000 || x>99999){
      System.out.print( "Introduzca un número: " );
      x = teclado.nextInt();
    }
    NumTexto = String.valueOf(x);
    for (i=0;i<NumTexto.length();i++){
      System.out.print(NumTexto.substring(i,(i+1)));
      System.out.print(" ");
    }   
  }
}
