//Realizar un programa que pida dos números enteros positivos por
//teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
//una opción y el programa deberá mostrar el resultado por pantalla y
//luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
//vez de salir del programa directamente, se debe mostrar el siguiente
//mensaje de confirmación: ¿Está seguro que desea salir del programa
//(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
//contrario se vuelve a mostrar el menú.

package g2_estructurasdecontrolenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej6MenuOperaciones 
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para acceder al menú:");
        System.out.println("Numero #1:");
        int num1 = leer.nextInt();
        System.out.println("Numero #2:");
        int num2 = leer.nextInt();
        
        int eleccion;
        String salir = "N";
        
        do{
            
            System.out.println("MENÚ");
            System.out.println(" 1. Sumar");
            System.out.println(" 2. Restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4. Dividir");
            System.out.println(" 5. Salir");
            System.out.println("Elija opción:");
            eleccion = leer.nextInt();
        
            switch(eleccion){
                case 1:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 + num2));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 - num2));
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 * num2));
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 / num2));
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Esta seguro que desea salir? ( S / N )");
                    salir = leer.next();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opcion invalida.");
                    System.out.println(" ");
            }
        } while (!"S".equalsIgnoreCase(salir));
    }
}
