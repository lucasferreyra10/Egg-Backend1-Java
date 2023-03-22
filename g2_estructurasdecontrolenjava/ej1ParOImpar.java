// Crear un programa que dado un número determine si es par o impar

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
public class ej1ParOImpar
{
 public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero. El programa indicará si es par o impar.");
        int num = leer.nextInt();
        
       if (num % 2 != 0) 
            {
                System.out.println("El numero es impar.");
            }
       else
            {
                System.out.println("El numero es par.");
            }
    }
  }   

