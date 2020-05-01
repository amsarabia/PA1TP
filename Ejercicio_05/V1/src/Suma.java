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
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int suma;
        
        System.out.println("Ingrese el primer número por pantalla: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextInt();
        
        System.out.println("Ingrese el segundo número por pantalla: ");  
        
        numero2 = EntradaTeclado.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma de los números ingresados es: " + suma);
        
        
    
    }
    
}
