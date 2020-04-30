package ejercicio_06;

import java.util.Scanner;

public class Ejercicio_06 {
    
    public static void main(String[] args) {
        int findResult = 0;
                
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        String inputUser = reader.next();
        reader.close();
        
        System.out.println("Cantidad de caracteres ingresados: " + inputUser.length());
        
        String operadoresPunt = ".;";
        System.out.println("Cantidad de operadores de puntuacion: " + getCharCount(inputUser, operadoresPunt));
        
        String vocales = "aeiou";
        System.out.println("Cantidad de vocales: " + getCharCount(inputUser, vocales));
        
        String consonantes = "bcdfghjklmnñpqrstvwxyz";
        System.out.println("Cantidad de consonantes: " + getCharCount(inputUser, consonantes));
    } 
    
    public static int getCharCount(String text, String charactersToLook) {
        int count = 0;
        
        char[] ch = text.toCharArray(); 
        
        for (int index = 0; index < ch.length; index ++) {
            if (charactersToLook.contains(String.valueOf(ch[index]).toLowerCase())) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        
        posicion = cadena.indexOf(caracter);
        
        // carac = cadena.
        
        while (posicion != -1) { 
            contador++;           
            
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        
        return contador;
    }
}
