/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author NICOLAS
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float numero1;
        float numero2;
        float resto;
        float cociente;
        
        
        System.out.println("Ingrese el primer número por pantalla: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextFloat();
        
        System.out.println("Ingrese el segundo número por pantalla: ");  
        
        numero2 = EntradaTeclado.nextFloat();
        
        cociente = numero1 / numero2;
        
        resto = numero1 % numero2;
        
        System.out.println("El cociente entre ambos números es: " + cociente);
        System.out.println("El resto de la división es: " + resto);
        
        
        
    }
    
}
