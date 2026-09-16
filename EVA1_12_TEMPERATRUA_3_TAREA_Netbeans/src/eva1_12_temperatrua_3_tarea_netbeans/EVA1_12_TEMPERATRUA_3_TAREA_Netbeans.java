
package eva1_12_temperatrua_3_tarea_netbeans;

import java.util.Scanner;

public class EVA1_12_TEMPERATRUA_3_TAREA_Netbeans {
    

    public static void main(String[] args) {
        //TAREA:
        // KELVIN A OTROS:
        // A CELSIUS C = K - 273.15
        // A FAHRENHEIT F = 1.8 * (K - 273.15) + 32
        
        double Kel, Cel, Far;
        Scanner Capt =  new Scanner(System.in);
        
        System.out.println("Introduce la temperatura en Kelvin: ");
        Kel = Capt.nextDouble();
        
        Cel = Kel - 273.15; 
        Far = 1.8 * (Kel - 273.15) + 32.0;
        
        System.out.println("LA OPERACION DE KELVIN A CELSIUS FUE :");
        System.out.println(Kel + "K = " + Cel + "°C");
        System.out.println("LA OPERACION DE KELVIN A FAHRENHEIT FUE:  ");
        System.out.println(Kel + "K = " + Far + "°F");
      
    }
    
}
