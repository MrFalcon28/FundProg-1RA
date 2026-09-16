
package eva1_11_temperatura_2_netbeans;

import java.util.Scanner;

public class EVA1_11_TEMPERATURA_2_Netbeans {

    public static void main(String[] args) {
        
        // FAHRENHEIT A OTROS:
        // A CELSIUS C = (F -32) / 1.8 
        // A Kelvin K = (F - 32) * 5/9 + 273.15
        
        double Far, Cel, Kel;
        Scanner Captu = new Scanner(System.in);
        
        System.out.println("Introduce la temperatua en Fahrenheit: ");
        Far = Captu.nextDouble();
        
        //NOTA: SI QUEREMOS DIVIDR Y QUE NOS DE DECIMAL, DEBEMOS HACERLO DOUBLES CON DOUBLES (ejemplo en el bloque 22)
        Cel = (Far - 32) / 1.8; //Celcius 
        Kel = (Far - 32.0) * (5.0/9.0) + 273.15;//Kelvin
        
        
        System.out.println("LA OPERACION DE FAHRENHEIT A CELCIUES FUE :");
        System.out.println(Far + "°F = " + Cel + "°C");
        System.out.println("LA OPEREACION DE FAHRENHEIT A KELVIN FUE:  ");
        System.out.println(Far + "°F = " + Kel + "K");
        
    }
    
}
