/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g3_subprogramasenjava;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ej11Codificar {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase a codificar:");
        String frase = leer.nextLine();
     
        String fraseCodificada = codificar(frase);
        
        System.out.println(fraseCodificada);
        
    }
    
    public static String codificar(String frase) {
        
        String fraseCodificada = "";
        String letra;
        
        for(int i = 0; i < frase.length(); i++){
            
            letra = frase.toLowerCase().substring(i, i+1);
            
            switch(letra){
                case "a":{
                letra = "@";
                break;}
                case "e":{
                letra = "#";
                break;}
                case "i":{
                letra = "$";
                break;}
                case "o":{
                letra = "%";
                break;}
                case "u":{
                letra = "*";
                break;}
                default:{
                }
            }
            
            fraseCodificada = fraseCodificada.concat(letra);
            
        }
        
        return fraseCodificada;
}
}
