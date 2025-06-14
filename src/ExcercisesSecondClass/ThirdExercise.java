package ExcercisesSecondClass;

import javax.swing.*;

/*
 * Calcular el salario neto mensual de un empleado a partir de su salario bruto.
 * Solicita el salario bruto mediante JOptionPane y calcula automaticamente las siguientes deducciones:
 * -10%  impuestos.
 * -5% seguro social.
 * -3% fondo ahorro.
 * Mostrar por consola un desglose detallado con los montos de cada deducción y el salario neto final.
 * Requisitos:
 * Usar solo operadores aritméticos y de asignación.
 * No usar condicionales ni estructuras repetitivas.
 * Aplicar cada porcentaje usando *=0.10, *=0.05 y *=0.03 respectivamente
 * */
public class ThirdExercise {
    public static void main(String[] args) {

        System.out.println("Calculemos el salario neto.");

        double grossSalary = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario bruto: "));

        double taxation = grossSalary * 0.10;
        double socialSecurity = grossSalary * 0.05;
        double fundSavings = grossSalary * 0.03;
        double netSalary = grossSalary - taxation - socialSecurity - fundSavings;

        System.out.println("Sueldo bruto: $" + grossSalary);
        System.out.println("Impuestos del 10%: $" + taxation);
        System.out.println("Seguro social del 5%: $" + socialSecurity);
        System.out.println("Fondo ahorro del 3%: $" + fundSavings);
        System.out.println("Sueldo neto: $" + netSalary);
    }
}

/*double taxation = grossSalary;
* taxation *= 0.10;
* double socialSecurity = grossSalary;
* socialSecurity *= 0.05;
* double fundSavings = grossSalary;
* fundSavings *= 0.03:
* double netSalary = grossSalary - taxation - socialSecurity - fundSavings;
* Otra opción implementando el *=
* */