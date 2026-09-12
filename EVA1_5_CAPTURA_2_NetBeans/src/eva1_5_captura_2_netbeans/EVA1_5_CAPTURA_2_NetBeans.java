
package eva1_5_captura_2_netbeans;

import java.util.Scanner;

public class EVA1_5_CAPTURA_2_NetBeans {
    public static void main(String[] args) {
 
    
    //DECLARAMOS LAS VARIABLES
    String Nombre;
    int Edad;
    double Salario;
    
    //Scanner
    
    Scanner Capt = new Scanner(System.in);
    
    //Capturar
    
    System.out.println("Captura el nombre del usuario: ");
    Nombre = Capt.nextLine(); 
    
    System.out.println("Captura la edad del usuario: ");
    Edad = Capt.nextInt();
    
    System.out.println("Captura el salario: ");
    Salario = Capt.nextDouble();
    
    System.out.println("!!!!!!!!!!!!!!!DATOS CAPTURADOS!!!!!!!!!!!!!!");
    
    System.out.println("Nombre: ");
    System.out.println(Nombre);
    
    System.out.println("Edad: ");
    System.out.println(Edad);
    
    System.out.println("Salario: ");
    System.out.println(Salario);
    }
    
}