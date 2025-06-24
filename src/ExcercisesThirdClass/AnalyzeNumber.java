package ExcercisesThirdClass;
import java.util.Scanner;

/*Ejercicio autonomo, analizar numeros. -Independent exercise, analyze numbers.
Aplicacion de estructuras condicionales, para analizar números y generar secuencias según la entrada del usuario.
Crear el menú con Bucle (while o do-while)
Manejo de opciones con condicionales (switch o if-else if)
*/
public class AnalyzeNumber {
    public static void main(String[] args) {
        
        System.out.println("\t\tBienvenidos.\n\tAnalizador de números y secuencias.");
        
        //Cramos las variables.
        var input = new Scanner(System.in);
        int optionMenu; //Opcion del menú
        
        //do_while para menu de opciones, si es mayor a 2, la opcion ingresada se va a repetir el menú
        //hasta que tome una opción valida.
        do {
            System.out.println("Escoge una opción:\n1-Analizar un solo número.\n2-Generar secuencia de números.\n0-Salir.");
            optionMenu = input.nextInt();
        }while (optionMenu < 0 || optionMenu > 2); //Si ingresa un número menor a cero o mayor a 2, va a pedir otra vez una opción.

        switch (optionMenu) {
            case 1:{
                    int firstNumber; //Primer número, para la opción 1.
                    double residue; //Variable para determinar el residuo.

                    System.out.println("1)Ingresa un número entero:");
                    firstNumber = input.nextInt();
                    residue = firstNumber % 2;

                    /*Implementamos condicionales (if, else if, else), para determinar si el número es:
                    -Positivo, negativo o cero.
                    -Par o impar (usando el operador módulo %).
                    -Mayor que 100, menor que 100 o igual a 100.
                    */

                    if (firstNumber > 0){ //Determinamos si es positivo.
                        System.out.printf("\tEl número %d es positivo.\n",firstNumber);
                    }else if (firstNumber < 0){ //Determinamos si es negativo.
                        System.out.printf("\tEl número %d es negativo.\n",firstNumber);
                    }else{ //Determinamos que el número es cero ya que no cumple ninguna de las anteriores condiciones.
                        System.out.printf("\tEl número %d es igual a cero.\n",firstNumber);
                    }

                    if (residue != 0){ //Determinamos si es impar.
                        System.out.printf("\tEl número %d es impar.\n",firstNumber);
                    }else{ //Determinamos que el número es par, ya que no cumple la condicion anterior.
                        System.out.printf("\tEl número %d es par.\n",firstNumber);
                    }
                    
                    if (firstNumber > 100){ //Determinamos si es mayor que 100.
                        System.out.printf("\tEl número %d es mayor que 100.\n",firstNumber);
                    }else if (firstNumber < 100){ //Determinamos si es menor que 100.
                        System.out.printf("\tEl número %d es menor que 100.\n",firstNumber);
                    }else{ //Determinamos que es igual a 100 ya que no cumple las condiciones anteriores.
                        System.out.printf("\tEl número %d es igual a 100.\n",firstNumber);
                    }
                break;
            }
            case 2:
                break;
            case 0:
                break;
            default:
                break;
        }

        input.close();
    }
}
