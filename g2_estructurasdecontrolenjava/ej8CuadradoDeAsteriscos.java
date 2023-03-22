//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.

package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej8CuadradoDeAsteriscos 
{ 
    public static void main(String[] args) 
    {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del cuadrado:");

        int columna;
        int filas;
        int num = leer.nextInt();
        
        for (columna = 1; columna <= num; columna++) 
        {
            for (filas = 1; filas <= num; filas ++) 
            {
                if ((columna > 1) && (columna < num) && (filas > 1) && (filas < num)) 
                {
                    System.out.print(" ");
                } 
                else 
                {
                    System.out.print("*");
                }
            }
                System.out.println("");
        }
    }  
}