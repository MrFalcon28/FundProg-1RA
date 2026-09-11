
package eva1_4_captura;

import java.util.Scanner;

public class EVA1_4_CAPTURA {

    public static void main(String[] args) {
        // Si vamos a usar variables, se tienen que declarar antes de usarse.
        // Declarar -> Crear la variable para su uso en el programa.
        // Sintaxis: TIPO_DATO nombre_identificador;
        // Usa nombres significativos que indiquen claramente para qué se usa.
        
        String nombre; // Declaración de la variable.
   
        Scanner capt = new Scanner(System.in); //Otra variable --> captu de tipo Scanner.
        
        System.out.println("Captura el nombre:");//ENTRADA DE DATOS DEL TECLADO (JAVA)
        //Capturar del teclado y ponerlo en la variable nombre.
        //Escrinir en la variable (poner un valor) ASIGNACÓN.
        nombre = capt.nextLine();
        System.out.println("El valor capturado es:");
        System.out.println(nombre); //USO LA VARIABLE --> LECTURA.
    }
    
}
