//Realizar un programa que simule el funcionamiento de un dispositivo
//RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
//cadenas deben llegar con un formato fijo: tienen que ser de un máximo
//de 5 caracteres de largo, el primer carácter tiene que ser X y el último
//tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas,
//la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
//FDE), y toda secuencia distinta de FDE, que no respete el formato se
//considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de
//lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
//deberá investigar cómo se utilizan las siguientes funciones de Java
//Substring(), Length(), equals().

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej7DispositivoRS232 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra");
        String palabra=leer.next();
        int correcto = 0, incorrecto = 0;
        
        while (!palabra.equals("&&&&&")){
        int tam = palabra.length();
        
        String p = palabra.substring(0,1);
            String pF = palabra.substring(tam-1, tam);
        if (tam == 5 && p.equals("x") && pF.equals("o")){
            correcto++;
            } else{
            incorrecto++;
        }
        System.out.println("Ingrese una palabra");
        palabra=leer.next();
        } 
       System.out.println("La cantidad de ingresos correctos fueron: " + correcto + " y los incorrectos fueron: " + incorrecto);
    }
}
