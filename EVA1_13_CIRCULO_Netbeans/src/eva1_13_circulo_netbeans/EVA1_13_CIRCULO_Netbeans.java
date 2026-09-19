
package eva1_13_circulo_netbeans;

import java.util.Scanner;

public class EVA1_13_CIRCULO_Netbeans {
    static final double PI = 3.1416; //VARIABLE --> CONSTANTE
    

    public static void main(String[] args) {
        
        //CALCULAR PERIMETRO, AREA Y VOLUMEN DE UN CIRCULO.
        //P = (2 * PI * R)
        //A = (PI * R²)
        //V = (3/4 * PI * R³)
        
        //double Radio, PI = 3.1416, Perim, Area, Vol;
        double Radio, Perim, Area, Vol;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL RADIO DEL CIRCULO: ");
        Radio = Capt.nextDouble();
        
        //Perim = (2 * PI * Radio);
        //Area = (PI * Radio * Radio);
        //Vol = (3.0/4.0 * PI * Radio * Radio * Radio);
        
        //MATH ES UNA LIBRERIA DE FUNCIONES MATEMATICAS
        
        Perim = (Math.pow(Radio, 2) * Math.PI);
        Area = (Math.PI *  Radio * Radio);
        Vol = (3.0/4.0 * Math.PI * Radio * Radio * Radio);
        
        //System.out.println("!!!!!!OPERACION REALIZADA!!!!!!");
        System.out.println("!!!!!!OPERACION REALIZADA!!!!!!");
        
        System.out.println("EL PERIMETRO DEL CIRCULO ES: " + Perim);
        
        System.out.println("EL AREA DEL CIRCULO ES: " + Area);
        
        System.out.println("EL VOLUMEN DEL CIRCULO ES: " + Vol);
        
    }
    
}
