/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner (System.in);
        double TotalP = 0, TotalC = 0, ISV = 1.16, CPC = 0, Total_ISV = 0;
        
        System.out.println("Ingrese el Total de Clics: ");
        int Cantidad_Clic = lea.nextInt();
        
        System.out.print("Ingrese Clic 1:");
        int Clic1 = lea.nextInt();
        System.out.print("Ingrese precio de Clic 1:");
        double Precio_C1 = lea.nextDouble();
        
        System.out.print("Ingrese Clic 2:");
        int Clic2 = lea.nextInt();
        System.out.print("Ingrese precio de Clic 2:");
        double Precio_C2 = lea.nextDouble();
        
        System.out.print("Ingrese Clic 3:");
        int Clic3 = lea.nextInt();
        System.out.print("Ingrese precio de Clic 3:");
        double Precio_C3 = lea.nextDouble();
        
        TotalP = Precio_C1*Clic1 + Precio_C2*Clic2 + Precio_C3*Clic3;
        CPC = TotalP / Cantidad_Clic;
        Total_ISV = TotalP * ISV ;
        
        System.out.println(String.format(" %.2f", CPC));
        System.out.println(String.format( "%.2f", Total_ISV));
        
        
    }
    
}
