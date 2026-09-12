
package eva1_6_vehiculo_netbeans;

import java.util.Scanner;


public class EVA1_6_VEHICULO_Netbeans {
    public static void main(String[] args) {
        //marca, modelo, año, color, kilometraje, precio
        
        String Marca;
        String Modelo;
        String Color;
        int Año;
        int Kilometraje;
        double Precio;
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA MARCA DEL VEHICULO: ");
        Marca = Capt.nextLine();
        
        System.out.println("INTRODUCE EL MODELO DEL VEHICULO: ");
        Modelo = Capt.nextLine();
        
        System.out.println("INTRODUCE EL COLOR DEL VEHICULO: ");
        Color = Capt.nextLine();
        
        System.out.println("INTRODUCE EL AÑO DEL VEHICULO: ");
        Año = Capt.nextInt();
        
        System.out.println("INTRODUCE EL KILOMETRAJE QUE PUEDE TENER EL VEHICULO: ");
        Kilometraje = Capt.nextInt();
        
        System.out.println("INTRODUCE EL PRECIO QUE PUEDE TENER EL VEHICULO: ");
        Precio = Capt.nextDouble();
        
        System.out.println("!!!!!!!!!!!!!!DATOS OBTENIDOS!!!!!!!!!!!!!!!!!");
        
        System.out.println("MARCA DEL VEHICULO: ");
        System.out.println(Marca);
        
        System.out.println("MODELO DEL VEHICULO: ");
        System.out.println(Modelo);
        
        System.out.println("COLOR DEL VEHICULO: ");
        System.out.println(Color);
        
        System.out.println("AÑO DEL VEHICULO: ");
        System.out.println(Año);
        
        System.out.println("KILOMETRAJE DEL VEHICULO: ");
        System.out.println(Kilometraje);
        
        System.out.println("PRECIO DEL VEHICULO: ");
        System.out.println(Precio);
    }
    
}
