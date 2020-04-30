package ejercicio_03;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < inputInt; i ++) {
            System.out.println(getFibonacci(i));
        }
    }
    
    static int getFibonacci(int n) {

        if (n > 1) {
            return getFibonacci(n - 1) + getFibonacci(n - 2);  
        
        } else if (n == 1) {  
            return 1;
        
        } else if (n == 0){  
            return 0;
        
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
        }
    }        
}
