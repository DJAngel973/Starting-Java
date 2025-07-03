package ExcercisesFourthClass;

import java.util.Scanner;

/*
* Module 1 Project: Basic student registration system
* Project objective
* Create a console program that simulates a very basic system to manage the information of a single student at a time,
* using functions to organize different tasks
* */
public class ProjectModule1 {

    public static String name = "";
    public static double firstNote;
    public static double secondNote;
    public static double thirdNote;

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int optionMenu;
        boolean exit = false;

        // added do-while loop to manage menu interaction
        do {
            System.out.println(" ---- Sistema Registro de Estudiantes ---- ");
            System.out.print("""
                    1. Registrar estudiante
                    2. Datos estudiante
                    3. Promedio notas del estudiante
                    4. Validar nota individual
                    0. Salir
                    Escoge una opción:
                    """);
            optionMenu = input.nextInt();
            input.nextLine();

            // Implemented a switch block to execute each menu option
            switch (optionMenu){
                case 1:
                    registerStudent(input);
                    break;
                case 2:
                    studentInformation();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    exit = true;
                    System.out.println("Gracias por tu registro.");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        }while(!exit);
    }
    // Create student registration function
    public static void registerStudent(Scanner input){

        // Stored the student's name and grades in their respective variables
        System.out.print("Nombre: ");
        name = input.nextLine();
        System.out.print("Primer nota: ");
        firstNote = input.nextDouble();
        System.out.print("Segunda nota: ");
        secondNote = input.nextDouble();
        System.out.print("Tercer nota: ");
        thirdNote = input.nextDouble();
    }
    // Create function to display student information
    public static void studentInformation(){

        // Added an if condition to check if the name variable is empty
        if (name.isEmpty()) {
            System.out.println("N/A");
        }else{
            System.out.printf("Nombre estudiante: %s", name);
            System.out.printf("Primer nota: %.2f", firstNote);
            System.out.printf("Segunda nota: %.2f", secondNote);
            System.out.printf("Tercer nota: %.2f", thirdNote);
        }
    }
}
