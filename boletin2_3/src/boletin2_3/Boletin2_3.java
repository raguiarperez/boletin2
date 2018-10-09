
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {


    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        System.out.println("Cantidad billetes 100: ");
        float x=ler.nextFloat();
        System.out.println("Cantidad billetes 20: ");
        float y=ler.nextFloat();
        System.out.println("Cantidad billetes 5: ");
        float z=ler.nextFloat();
        System.out.println("Cantidad moedas 1: ");
        float m=ler.nextFloat();
        
        float dinero= (x*100)+(y*20)+(z*5)+(m*1);
      
        System.out.println("dinero total: "+dinero+" €");
        
    }
    
}
