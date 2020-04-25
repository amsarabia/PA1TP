import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String args[]) {
        System.out.print("Ingrese un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        if (inputString.length() == 0) {
            System.out.println("Nombre invalido");

        } else {
            System.out.println("Bienvenido " + inputString);
        }
        
        scanner.close();
    }
}