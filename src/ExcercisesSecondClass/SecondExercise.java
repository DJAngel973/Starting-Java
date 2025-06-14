package ExcercisesSecondClass;

import javax.swing.*;
import java.util.Scanner;

/*
* Calcular la propina del restaurante.
* Solicita por consola (Scanner) el monto total de la cuenta y el porcentaje de propina que desea dejar el cliente (15, 18 o 20).
* Mostrar el resultado final con un JOptionPane.ShowMessageDialog indicando:
* -Valor propina.
* -Total a pagar(cuenta + propina).
* Requisitos:
* Utilizar operadores aritméticos y de asignación.
* Aplicar el porcentaje usando *=0.01.
* No utilizar condicionales ni ciclos.
* */
public class SecondExercise {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        double count, baksheesh, percentageCount, totalCount;

        System.out.println("Calculemos el valor a pagar en un restaurante con propina.");
        System.out.println("Porcentaje propina de 15, 18 o 20");

        System.out.print("Ingresa valor total de la cuenta: ");
        count = entry.nextDouble();
        System.out.print("Ingresa valor del porcenaje: ");
        baksheesh = entry.nextDouble();

        baksheesh *=0.01;
        // La multiplicación Se recomienda cuando se trabajan con tasas de convesión o escalas pequeñas y la división cuando se ajustan valores: /= 100
        percentageCount = count * baksheesh;
        totalCount = percentageCount + count;

        JOptionPane.showMessageDialog(null, "Valor propina: " + "$" + percentageCount);
        JOptionPane.showMessageDialog(null, "Total a pagar: " + "$" + String.format("%.2f", totalCount));

    }
}

/*
= → Asignación (a = 5)
+= → Suma y asignación (a += 3 es equivalente: a = a + 3)
-= → Resta y asignación (a -= 2 es equivalente: a = a - 2)
*= → Multiplicación y asignación (a *= 4 es equivalente: a = a * 4)
/= → División y asignación (a /= 2 es equivalente: a = a / 2)
%= → Módulo y asignación (a %= 3 es equivalente: a = a % 3)
* */