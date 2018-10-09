
package boletin2_2;

import java.util.Scanner;

public class Boletin2_2 {


    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        System.out.println("temperatura cº: ");
        float cº=ler.nextFloat();
        
        float fº= (float) (cº*1.8 +32);
        float kº=(float) (cº+273.15);
      
       
       
        System.out.println("fahreheint: "+fº+"\nkelvin: "+kº);
        
    }
    
}
