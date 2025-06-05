import java.util.Scanner;

public class VariablesScanner {

    public static void main(String[] args){

        //Data entry via console. -Entrada de datos por consola.
        Scanner entry = new Scanner(System.in);

        //We create variables. -Creamos variables.
        int age;
        String name;
        float height;
        char letter;

        //We take the data assigned to your variable. -Tomamos los datos asignados a su varible.
        System.out.println("Digita la edad: ");
        age = entry.nextInt();

        entry.nextLine();
        /*
        Clear the buffer. -Limpiar el buffer.
        It is cleared when a numeric read method such as nextInt(), nextDouble(), nextByte(), etc. is performed,
        and immediately a method is required that reads a line like nextLine().
        Se limpia cuando se ejecuta un método de lectura numérica como nextInt(), nextDouble(), nextByte(), etc.
        e inmediatamente se requiere un metodo que lea una linea como nextLine().
        */

        System.out.println("Digita el nombre: ");
        name = entry.nextLine();

        System.out.println("Digita la estatura: ");
        height = entry.nextFloat();
        //The decimal is with (,), if it is not an error. -El decimal se con (,), si no es error.

        System.out.println("Digita una letra: ");
        letter = entry.next().charAt(0);

        //Print data to console. -Imprimir datos por consola.
        System.out.println(name + " tiene " + age + " años y su estatura es de " + height + "mts.");
        System.out.println("Letra: " + letter);

    }
}