
package boletin71;

import java.util.Scanner;


public class Boletin71 {

   
    public static void main(String[] args) {
    
    numero obx=new numero();
    Scanner valor=new Scanner(System.in);
        System.out.println("escribe tu número positivo: ");
   float a= valor.nextFloat();
  obx.setNumero(a);
  // ** tamen podo facer  obx.setNumero(valor.nextFloat());
        obx.Condicion();
    }
    
}
