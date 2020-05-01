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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int numero1;
        int fibo1 = 0;
        int fibo2 = 1;
        int acum1;
        
        int numero2;
        int fibo3 = 0;
        int fibo4 = 1;
        int acum2;
        
        System.out.println("Ingrese la cantidad de números que tenga la serie 1: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextInt();
        
        System.out.println("Ingrese la cantidad de números que tenga la serie 2: ");
        
        numero2 = EntradaTeclado.nextInt();
        
        for (int i=1;i<=numero1;i++){
        
            System.out.print(fibo1+" ");
            
            acum1= fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = acum1;
          
        }
        
        System.out.println("");
        
        for (int i=1;i<=numero2;i++){
        
            System.out.print(fibo3+" ");
            
            acum2= fibo3 + fibo4;
            fibo3= fibo4;
            fibo4 = acum2;
          
        }
   
        
    }
    
}
