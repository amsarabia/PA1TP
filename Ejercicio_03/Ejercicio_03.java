import java.util.Scanner;

public class Ejercicio_03 {
    static String Fibonacci = "";

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();
        scanner.close();

        getFibonacci(inputInt);
        System.out.println(Fibonacci);
    }

    static int getFibonacci(int n)
    {
        if (n > 1) {
            Fibonacci += String.valueOf(n - 2) + ", " + String.valueOf(n - 1) + "; ";
            // System.out.println(String.valueOf(n - 2) + ", " + String.valueOf(n - 1));
            return getFibonacci(n - 2) + getFibonacci(n - 1);  
        
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