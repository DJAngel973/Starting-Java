package ExercisesSecondClass;

import javax.swing.*;
import java.util.Scanner;

/*
* Calcular el rendimiento anual de una inversión.
* Solicitar mediante Scanner el capital y la tasa de interés anual (Porcentaje).
* Mostrar el resultado en una ventana emergente (JOptionPane) con los siguientes datos:
* Interes generado en un año.
* Monto final al término del año (capital + interés).
* Porcentaje debe aplicarse multiplicando por 0.01.
* No usar condicionles ni bucles.
* Usar únicamente operaciones aritméticas y entrada/salida básica.
* */
public class FourthExercise {
    public static void main(String[] args) {

        System.out.println("Calculemos el rendimiento anual de una inversión.");
        Scanner entry = new Scanner(System.in);

        //Variables. -Variable.
        double capital;
        double interestRate;
        double totalInterestRate;
        double totalCapital;

        //Tomamos los datos por consola. -We take the data by console.
        System.out.println("Ingresa el capital: ");
        capital = entry.nextDouble();
        System.out.println("Ingresa la tasa de interés anual: ");
        interestRate = entry.nextDouble();

        interestRate *= 0.01;   //Convertimos la tasa interes ingresada al porcentaje
        totalInterestRate = capital * interestRate;
        totalCapital = capital + totalInterestRate;  //Sumamos el capital y le interesRate para saber el monto final al terminar el año.

        JOptionPane.showMessageDialog(null, "Intereses generado en una año: $" + totalInterestRate);
        JOptionPane.showMessageDialog(null,"Monto final: $" + totalCapital);
    }
}
