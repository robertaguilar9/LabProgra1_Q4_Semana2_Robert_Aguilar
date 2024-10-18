/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        double Total = 0, CuotaM = 0, Total1 = 0;
        
        System.out.println("Ingrese el monto del Prestamo:");
        double Prestamo = lea.nextDouble();
        
        System.out.println("Ingrese el plazo de meses a Pagar:");
        double plazo_meses = lea.nextDouble ();
        
        System.out.println("Ingrese el interes mensual:");
        double interes_mensual = lea.nextDouble ();
        
        System.out.println("Ingrese la comision por cuota:");
        double comision_cuota = lea.nextDouble ();
        
        System.out.println("Ingrese el porcentaje del seguro mensual aplicado a la cuota:");
        double seguro_porcentaje = lea.nextDouble ();
        
        double interes_total = (Prestamo*(interes_mensual / 100)) * plazo_meses;
        double total = Prestamo * interes_total;
        double cuota_base_mensual = total / plazo_meses;
        
        double seguro_mensual = cuota_base_mensual * (seguro_porcentaje / 100);
        
        double cuota_mensual = cuota_base_mensual + seguro_mensual + comision_cuota;
        
        double total_pagar = cuota_mensual * plazo_meses;
        
        System.out.println("                         "+
                "\n*****CUOTAS MENSUALES*****"+
                "\nCuota de Pago Mensual: Lps. " + String.format("%.2f", cuota_mensual) +
                "\nTotal a Pagar: Lps. " + String.format("%.2f", total_pagar));
    }
    
}
