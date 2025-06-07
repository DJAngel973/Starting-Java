import javax.swing.*;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        //Example generate a discount on a value. -Ejemplo generar descuento de un valor.
        double originalPrice = Double
                .parseDouble(JOptionPane.showInputDialog("Digite precio del producto: "));

        double discountPercentage = Double
                .parseDouble(JOptionPane.showInputDialog("Digite el porcentaje de descuento: "));

        double discount = (originalPrice * discountPercentage) / 100;
        double total = originalPrice - discount;

        //We show the values in the console. -Mostramos por consola los valores.
        System.out.print("Costo del producto: " + originalPrice);
        System.out.print("Valor descuento: " + discount);
        System.out.print("Valor a pagar: " + total);

        /*
        * Operators. -Operadores
        * (=) To assign values. -Para asignar valores.
        * (*) Sum. -Suma
        * (-) Subtraction. -Resta
        * (*) Multiplication. -Multiplicación
        * (/) Division. -División
        * */

        /*
        * En Dev Senior para la certificación del modulo 4 se promedia 3 notas.
        * 1 nota 0.35
        * 2 nota 0.25
        * 3 nota 0.40
        * Calcular el promedio del estudiante.
        */

        //We take user data. -Tomamos los datos del usuario.
        Scanner entry = new Scanner(System.in);

        //Declare variable and request data by console. -Declarar variable y pedir datos por consola.
        float n1, n2, n3;

        System.out.print("Digite la nota 1: ");
        n1 = entry.nextFloat();
        System.out.print("Digite la nota 2: ");
        n2 = entry.nextFloat();
        System.out.print("Digite la nota 3: ");
        n3 = entry.nextFloat();

        //We implement operations. -Implementamos operaciones.
        n1 *= 0.35f;
        n2 *= 0.25f;
        n3 *= 0.40f;

        float average = n1 + n2 + n3;

        System.out.println("El promedio del estudiante es: " + average);

        /*
        * Operator with assignment. -Operador con asiganción.
        * (*=) Equivalent. -Equivale:
        * n1 = n1 * 0.35f;
        * */

    }
}
