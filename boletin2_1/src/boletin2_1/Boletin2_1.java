
package boletin2_1;

import java.util.Scanner;

public class Boletin2_1 {


    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        System.out.println("Precio tarifa: ");
        float pt=ler.nextFloat();
        System.out.println("Precio pagado: ");
        float pp=ler.nextFloat();
        
        float des= (pp*100)/pt;
      
        System.out.println("descuento "+des+" %");
        
    }
    
}
