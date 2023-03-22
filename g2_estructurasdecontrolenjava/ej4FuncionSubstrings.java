//Escriba un programa que pida una frase o palabra y valide si la primera
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
//contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
//Substring y equals() de Java.

package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej4FuncionSubstrings 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase o palabra. Validaremos si es correcta o no:");
        String frase = leer.next();
        
        if ("A".equalsIgnoreCase(frase.substring(0,1)))
         {
             System.out.println("Correcto.");
         }        
        else
        {
            System.out.println("Incorrecto.");
        }
    }
}
