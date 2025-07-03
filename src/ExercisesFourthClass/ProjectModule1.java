package ExercisesFourthClass;

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
    public static double averageNote;

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
                    studentAverage();
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
        do{
            System.out.print("Nombre: ");
            name = input.nextLine();
            if(!validateName(name)){
                System.out.println("Ingresa un nombre valido.");
            }
        }while(!validateName(name));

        // Verify firstNote
        do{
            System.out.print("Primer nota: ");
            firstNote = input.nextDouble();
            if(!verifyNote(firstNote)){
                System.out.println("Nota invalida, debe estar entre 0 y 100.");
            }
        }while(!verifyNote(firstNote));

        // Verify secondNote
        do{
            System.out.print("Segunda nota: ");
            secondNote = input.nextDouble();
            if(!verifyNote(secondNote)){
                System.out.println("Nota invalida, debe estar entre 0 y 100.");
            }
        }while(!verifyNote(secondNote));

        // Verify thirdNote
        do {
            System.out.print("Tercer nota: ");
            thirdNote = input.nextDouble();
            if(!verifyNote(thirdNote)){
                System.out.println("Nota invalida, debe estar entre 0 y 100.");
            }
        }while(!verifyNote(thirdNote));
    }
    // Displays registered student information
    public static void studentInformation(){

        // Added an if condition to check if the name variable is empty
        if (name.isEmpty()) {
            System.out.println("N/A");
        }else{
            System.out.printf("Nombre estudiante: %s\n", name);
            System.out.printf("Primer nota: %.2f\n", firstNote);
            System.out.printf("Segunda nota: %.2f\n", secondNote);
            System.out.printf("Tercer nota: %.2f\n", thirdNote);
        }
    }
    // Calculate average of the student's grades
    public static void studentAverage(){

        // Calculates the average score from the three grades
        averageNote = (firstNote + secondNote + thirdNote) / 3;
        System.out.printf("Promedio de las notas: %.2f\n", averageNote);
    }
    // Verify notes entered
    public static boolean verifyNote(double note){

        // Determine note range
        return note >= 0 && note <= 100;
    }
    // Validate name entered
    public static boolean validateName(String name){

        // Valide name: check for null or empty input
        return name != null && !name.trim().isEmpty();
        // '!=null' Verify if the variable was not initialized.
        // '!name.trim().isEmpty()' Eliminate blank spaces before checking if it is empty.
    }
}
