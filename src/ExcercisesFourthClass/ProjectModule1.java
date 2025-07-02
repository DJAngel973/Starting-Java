package ExcercisesFourthClass;

/*
* Module 1 Project: Basic student registration system
* Project objective
* Create a console program that simulates a very basic system to manage the information of a single student at a time,
* using functions to organize different tasks
* */
public class ProjectModule1 {
    public static void main(String[] args) {

        
        boolean exit = false;

        do {
            System.out.println(" ---- Sistema Registro de Estudiantes ---- ");
            System.out.println("""
                    1. Registrar datos de un estudiante
                    2. Mostrar datos del estudiante actual
                    3. Calcular promedio de notas del estudiante actual
                    4. Validar una nota individual
                    0. Salir
                    Escoge una opción:
                    """);
        }while(!exit);

    }
}
