package ExercisesThirdClass;

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
        boolean exit = false; // exit to finalize menuOpcion

        // add do-while loop for menu flow
        do{
            System.out.println("""
                        Escoge una opción para interactuar(1, 2, 3 o 4):
                        1)Calcular el área de una figura (circulo, rectangulo).
                        2)Calcular edad futura.
                        3)Verificar si un número es primo.
                        4)Salir del programa.
                        """);
            menuOption = input.nextInt();

            // switch statement for main menu options
            switch (menuOption) {
                case 1:{
                
                    // Variable
                    int subOption;
                    final var pi =3.14159;
                    double radio;
                    double area;
                    double base;
                    double height;
                    boolean exitSubOption = false; // exit to finalize sub-option
                
                    // add do-while loop for sub-option
                    do{
                        System.out.println("""
                                    Que área necesitas(1, 2):
                                    1)Área circulo.
                                    2)Área rectangulo
                                    3)Menú principal
                                    """);
                        subOption = input.nextInt();

                        switch (subOption) {
                            case 1: {
                                // Request the area of the circle
                                System.out.println("---Área circulo---");
                                System.out.println("Ingresa el radio del circulo:");
                                radio = input.nextDouble();
                                
                                // Operation to find the area of the circle
                                area = pi*Math.pow(radio,2);

                                // Print result message
                                System.out.printf("El área del circulo con radio %.2f es: %.2f\n",radio, area);
                            }
                                break;
                            case 2:{
                                // Request the base of the rectangle
                                System.out.println("---Área rectangulo---");
                                System.out.println("Ingresa la base del rectangulo:");
                                base = input.nextDouble();
                                
                                // Request the height of the rectangle
                                System.out.println("Ingresa la altura del rectangulo:");
                                height = input.nextDouble();

                                // Operation to find the arae of the rectangle
                                area = base*height;

                                // Print result message
                                System.out.printf("El área del rectangulo es: %.2f\n", area);
                            }
                                break;
                            
                            case 3:
                                exitSubOption=true;
                                System.out.println("----Menú principal----\n");
                                break;
                    
                            default:
                                System.out.println("Opción invalidad.");
                                break;
                        }
                    }while(!exitSubOption);

                }
                    break;

                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    exit=true;
                    System.out.println("Gracias por participar.");
                    break;
                default:
                System.out.println("Opción invalidad.");
                    break;
            }
        }while(!exit); //If menuOption is less that one or greater that four, the loop repeats
        
        input.close();
    }
}