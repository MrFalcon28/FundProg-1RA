
package eva1_7_operaciones_netbeans;

public class EVA1_7_OPERACIONES_Netbeans {

    public static void main(String[] args) {
        
        //EL TIPO DE DE DATO DETERMINA LAS OPERACIONES
        //ENTEROS, REALES, CADENAS, LOGICOS, ETC
        //EXPRESION:
        //VALORES
        //VARIABLES
        //OPERACIONES
        //FUNCIONES
        //QUE SE EVALUAN PARA OBTENER UN NUMERO
        
        //OPERACIONES CON NUMEROS:
        //ARITMETICAS:
        
        int suma, val1, val2; //DECLARAR 3 VARIABLES DEL MISMO TIPO
        //ASIGNACION: PONER UN VALOR EN UNA VARIABLE
        //OPERADOR --> SIMBOLO QUE TRABAJA  SOBRE IDENTIFICADORES.
        // = --> ASIGNACION --> PONER VALOR
        // == --> COMPARACION
        val1 = 100;//ASIGNAR EL VALOR DE 100 A LA VARIABLE val1
        val2 = 50;
        suma = val1 + val2;//EXPRESION, ASIGNAR A LA VARIABLE LA OPERACION ENTRE val1 Y val2 (+)
        //+ --> ESTA ENTRE DOS ENTEROS, SE INTERPRETA COMO LOS QUE DEBE SUMAR
        System.out.print("val1 =");
        System.out.println(val1);
        System.out.print("val2 =");
        System.out.println(val2);
        System.out.print("suma =");
        System.out.println(suma);
        
        //OPERACIONES RESPETAN REGLAS MATEMATICAS
        //MULTIPLICACION
        // *
        
        int multi;
        multi = val1 * val2;
        
        System.out.print("Multiplicacion =");
        System.out.println(multi);
        
        //DIVISION
        // /--> OPERADOR DE DIVISION
        
        int divi;
        divi = val1 / val2;
        System.out.print("Division =");
        System.out.println(divi);
        val1 = 10;
        val2 = 3;
        
        divi = val1 / val2;
         System.out.print("val1 =");
        System.out.println(val1);
        System.out.print("val2 =");
        System.out.println(val2);
        System.out.print("Division =");
        System.out.println(divi);
        
        double resu;
        resu = val1 / val2;
        System.out.print("Resultado =");
        System.out.println(resu);
        
        double val2copia;
        val2copia = 3;
        resu = val1 / val2copia;
        System.out.print("Resultado =");
        System.out.println(resu);
        
    }
    
}
