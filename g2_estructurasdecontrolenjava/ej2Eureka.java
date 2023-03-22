// Crear un programa que pida una frase y si esa frase es igual a “eureka” el
// programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
//Incorrecto. Nota: investigar la función equals() en Java.

package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej2Eureka 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la frase correcta: ");
        String frase  = leer.next();
        
        if (frase.equalsIgnoreCase("eureka"))
        {
            System.out.println("Contraseña correcta"); 
        }
        else
        {   
           System.out.println("Contraseña incorrecta"); 
        }
    }
}   