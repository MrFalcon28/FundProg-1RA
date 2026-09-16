
package eva1_10_temperatura_netbeans;

import java.util.Scanner;

public class EVA1_10_TEMPERATURA_Netbeans {

    public static void main(String[] args) {
        
        double temp, far, kelvin; //VARIABLES (IDENTIFICADORES VALIDOS)
        Scanner Captu = new Scanner(System.in);
        
        //SOLICITAR LOS DATOS AL USUARIO
        System.out.println("Introduce la temperatua en centigrados: ");
        temp = Captu.nextDouble();
        
        //HACER CALCULO
        far = (temp * 1.8) + 32; //GRADOS 
        kelvin = temp + 273.15;//KELVIM
        
        //MOSTRAR RESULTADOS AL USUARIO
        System.out.println(temp + "°C = " + far + "°F");
        System.out.println(temp + "°C = " + kelvin + "K");
        
    }
    
}
