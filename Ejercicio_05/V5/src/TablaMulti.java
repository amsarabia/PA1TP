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
public class TablaMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int numero2;
        
        System.out.println("Ingrese un número entero del 1 al 9 por pantalla: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextInt();
        
        System.out.println("Ingrese otro entero del 1 al 9 por pantalla: ");
        
        numero2 = EntradaTeclado.nextInt();
        
        System.out.println("La tabla de multiplicar del primero es:");
            for (int i=1;i<=10;i++){
        
                int resultado1 = numero1 * i;
                System.out.println(numero1+"x"+i+"="+resultado1);   
            
            }
        System.out.println("La tabla de multiplicar del segundo es:");    
            for (int i=1;i<=10;i++){
                
                int resultado2 = numero2 * i;
                System.out.println(numero2+"x"+i+"="+resultado2);
                
            }
            
    }
}
        
    
