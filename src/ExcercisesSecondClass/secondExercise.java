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
public class secondExercise {
    public static void main(String[] args) {

        System.out.println("Calculemos el salario neto.");

        double grossSalary;
        double taxation = 0.10;
        double socialSecurity = 0.05;
        double fundSavings = 0.03;

        grossSalary = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario bruto: "));

        double taxationSalary

    }
}
