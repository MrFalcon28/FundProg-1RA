
package eva1_14_formula.general_netbeans;

import java.util.Scanner;

public class EVA1_14_FORMULAGENERAL_Netbeans {

    public static void main(String[] args) {
       //DECLARAR
       //CAPTURAR
       //CALCULAR
       //MOSTRAR RESULTADOS
       
       //FUNCION CUADRATICA --> FORMULA GENERAL
       
       double x1, x2, Val1, Val2, Val3;
       Scanner Capt = new Scanner(System.in);
       
       System.out.println("CAPTURA LOS VALORES QUE ESTEN EN LA FUNCION CUADRATICA: ");
       System.out.print("a= ");
       Val1 = Capt.nextInt();
       System.out.print("b= ");
       Val2 = Capt.nextInt();
       System.out.print("c= ");
       Val3 = Capt.nextInt();
       
      x1 = (-Val2 + Math.sqrt(Math.pow(Val2, 2) - (4 * Val1 * Val3))) / (2 * Val1);
      x2 = (-Val2 - Math.sqrt(Math.pow(Val2, 2) - (4 * Val1 * Val3))) / (2 * Val1);
      
      System.out.println("!!!!!!!!!!!!OPERACION REALIZADA!!!!!!!!!!!!!");
      
      System.out.println("EL RESULTADO DE LA OPEREACION 1 ES: " + x1);
      System.out.println("EL RESULTADO DE LA OPEREACION 2 ES: " + x2);
       
    }
    
}
