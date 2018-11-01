package prog_02_Ejer03;

/**
 * @nombreClase 1º Dam_Ta
 * @author Gonzalo González Ventura
 */
public class PROG_02_Ejer03 {
    
    public static void main(String[] args) {
        /**Si un empleado está casado o no.*/
        boolean casado=true;
        /**Valor máximo no modificable: 999999.*/
        int maximo=999999;
        /**Dia de la semana*/
        byte diaSem=1;
        /**Día del año.*/
        short diaAno=300;
        /**Sexo: con dos valores posibles 'V' o 'M'*/
        char sexo='M';
        /**Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.*/
        long milisegundos=1298332800000L;
        /**Almacenar el total de una factura*/
        double factura=10350.678;
        /**Población mundial del planeta tierra.*/
        long poblacion=6775235741L;
        
        System.out.println(casado);
        System.out.println(maximo);
        System.out.println(diaSem);
        System.out.println(diaAno);
        System.out.println(milisegundos);
        System.out.println(factura);
        System.out.println(poblacion);
        System.out.println(sexo);
        
        System.out.print("\n" + casado);
        System.out.print("\n" + maximo);
        System.out.print("\n" + diaSem);
        System.out.print("\n" + diaAno);
        System.out.print("\n" + milisegundos);
        System.out.print("\n" + factura);
        System.out.print("\n" + poblacion);
        System.out.print("\n" + sexo);
        
        System.out.printf("\n" + casado);
        System.out.printf("\n" + maximo);
        System.out.printf("\n" + diaSem);
        System.out.printf("\n" + diaAno);
        System.out.printf("\n" + milisegundos);
        System.out.printf("\n" + factura);
        System.out.printf("\n" + poblacion);
        System.out.printf("\n" + sexo);
    }
    
}
