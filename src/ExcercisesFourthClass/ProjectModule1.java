package ExcercisesFourthClass;

import java.util.Scanner;

/*
* Module 1 Project: Basic student registration system
* Project objective
* Create a console program that simulates a very basic system to manage the information of a single student at a time,
* using functions to organize different tasks
* */
public class ProjectModule1 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int optionMenu;
        boolean exit = false;

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

            switch (optionMenu){
                case 1:
                    studentInformation(input);
                    break;
                case 2:
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
    //
    public static void studentInformation(Scanner input){

        String name;
        double firstNote;
        double secondNote;
        double thirdNote;

        System.out.print("Nombre: ");
        name = input.nextLine();
        System.out.print("Primer nota: ");
        firstNote = input.nextDouble();
        System.out.print("Segunda nota: ");
        secondNote = input.nextDouble();
        System.out.print("Tercer nota: ");
        thirdNote = input.nextDouble();
    }
}
