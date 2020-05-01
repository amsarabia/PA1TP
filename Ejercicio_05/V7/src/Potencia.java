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
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1;
        int numero2;
        long potencia1 = 1;
        long potencia2 = 1;
        
        System.out.println("Ingrese el primer número por pantalla: ");
        
        Scanner EntradaTeclado = new Scanner (System.in);
              
        numero1 = EntradaTeclado.nextInt();
        
        System.out.println("Ingrese el segundo número por pantalla: ");  
        
        numero2 = EntradaTeclado.nextInt();
        
        
       for (int i=1;i<=numero2;i++ ){
       
       potencia1= potencia1 * numero1;
       
       }
        
       System.out.println(numero1+" elevado a la "+numero2+" es: "+potencia1);  
       
       for (int i=1;i<=numero1;i++ ){
       
       potencia2= potencia2 * numero2;
       
       }
        
       System.out.println(numero2+" elevado a la "+numero1+" es: "+potencia2);
        
        
    }
    
}
