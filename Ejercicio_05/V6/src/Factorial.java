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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int numero2;
        
        System.out.println("Ingrese el primer número por pantalla: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextInt();
        
        System.out.println("Ingrese el segundo número por pantalla: ");
              
        numero2 = EntradaTeclado.nextInt();
       
        long factorial1 = 1;
        long factorial2 = 1;
        
        for(int i=1;i<=numero1;i++){
                 
            factorial1= factorial1 * i;
            
        }
        
        System.out.println("El factorial de "+numero1+" es: "+factorial1);
        
        for(int i=1;i<=numero2;i++){
                 
            factorial2= factorial2 * i;
            
        }
        
        System.out.println("El factorial de "+numero2+" es: "+factorial2);
        
    }
    
}
