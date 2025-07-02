package ExcercisesThirdClass;

import java.util.Scanner;

/*
 * Create a java program that displays a menu to the user and performs different actions based on their selection, using conditionals and loops.
 */
public class MenuConsole {
    public static void main(String[] args) {
        /*
        * Menu options:
        * -Calculate the area of a figure(sub-option: circle or rectangle)
        * -Calculate future age
        * -Check if a number is prime
        * -Exit the program
        */

        System.out.println("\t\tBienvenidos.\n\tProvemos el siguiente menú.");

        //Variables
        var input = new Scanner(System.in);
        int menuOption; // Take menu opcion

        //
        do{
            System.out.println("Escoge una opción para interactuar(1, 2, 3 o 4):\n1)Calcular el área de una figura.\n2)Calcular edad futura.\n3)Verificar si un número es primo.\n4)Salir del programa.");
            menuOption = input.nextInt();
        }while(menuOption < 1 || menuOption  > 4); //If menuOption is less that one or greater that four, the loop repeats

        input.close();
    }
}