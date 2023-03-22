//Escriba un programa en el cual se ingrese un valor límite positivo, y a
//continuación solicite números al usuario hasta que la suma de los
//numeros introducidos supere el límite inicial.

package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej5Limites
{
 public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        int suma=0, limite, valor;
        System.out.println("Ingrese un valor límite para luego inicializar sumas: ");
        limite = leer.nextInt();
        
        do {            
            System.out.println("Ingrese un valor para sumar: ");
            valor = leer.nextInt();
            suma = suma + valor;
        } while (suma < limite);
    }  
}
