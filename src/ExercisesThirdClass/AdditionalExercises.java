package ExercisesThirdClass;

import java.util.Scanner;

public class AdditionalExercises {
    public static void main(String[] args) {
        
        var input = new Scanner (System.in); // Variable take data user
        var exit = false; // Variable for close menu

        do{
            // Show menu
            System.out.println("""
                    ----- Ejercicios clase tres Modulo 1 -----
                    1. Comprobar número real.
                    9.
                    0. Salir.
                    Escoge una opción: """);
            var option =input.nextInt();
            input.nextLine();

            // 'Switch' to choose option
            switch (option) {
                case 1:
                    checkNumber(input);
                    break;
                case 9:
                    shirtSale(input);
                    break;
                case 0:
                    exit = true;
                    break;
            
                default:
                System.out.println("Opcion incorrecta.");
                    break;
            }

        }while(!exit);
        System.out.println("Gracias por participar.");
    }
    // Exercise nine: selling shirts
    public static void shirtSale(Scanner input){
        /*
        * A wholesale shirt vendor offers different prices depending on the number of units purchased.
        * The following table shows the pricing information:
        * Units         Price per unit
        * [1 - 50]	    $50.000
        * (50 - 100]	$45.000
        * (100 - 150]	$40.000
        * (150 - 200]	$35.000
        * > 200	        $25.000
        * Write a program that, given a number of shirts, returns the price per unit.
        */

    }


    // Exercise one: verify normal numbers
    public static void checkNumber(Scanner input){

        // Write a program that allows the user to enter a real number and identifies whether the number is negative, positive or zero.
        System.out.print("Ingresa el número real a evaluar: ");
        var realNumber = input.nextDouble();
        input.nextLine();
        
        /*
        * if(realNumber == 0){
        *   System.out.println("El número es cero.");
        * }else if(real < 0){
        *   System.out.println("El número es negativo.");
        * }else {
        *   System.out.println("El número es positivo.")
        * }
        */

        //
        System.out.print(realNumber == 0 ? "El número es cero.\n":
                        realNumber < 0 ? "El número es negativo.\n" : "El número es positivo\n");
    }
}