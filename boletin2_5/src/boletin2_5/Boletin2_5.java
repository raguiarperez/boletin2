
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Sueldo fijo: ");
        float sueldof=ler.nextFloat();
        System.out.println("Importe total de ventas: ");
        float comision=ler.nextFloat();
        System.out.println("Kilometraje: ");
        float kilom=ler.nextFloat();
        System.out.println("Desplazamiento(días): ");
        float dieta=ler.nextFloat();
        

        comision=comision*0.05f;
        kilom=2*kilom;
        dieta=30*dieta;
        
        float saldob= sueldof+comision+kilom+dieta;
        
        float irpf= saldob*0.18f;
        float ss= 36f;
        
        System.out.println("Sueldo bruto = "+saldob+" €");
        System.out.println("Sueldo líquido = "+(saldob-irpf-ss)+" €");
        
    }
    
}