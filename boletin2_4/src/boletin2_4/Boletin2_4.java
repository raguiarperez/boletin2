
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        System.out.println("cantidade enteira: ");
        int cant=ler.nextInt();
        int b100= cant/100;
        int b20=(cant%100)/20;
        int b5=((cant%100)%20)/5;
        int m1=(((cant%100)%20)%5)/1;
        
        System.out.println("Billetes de 100: "+b100+ "\nBilletes de 20:"+b20+"\nBileltes de 5:"+b5+"\nMonedas de 1:"+m1);
        
    }
    
}
