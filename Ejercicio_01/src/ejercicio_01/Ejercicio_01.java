/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

public class Ejercicio_01 {

    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Bienvenido " + args[0]);
        
        } else {
            System.out.println("Cantidad de Parametros invalida. Enviar solo 1.");
        }          
    }
}
