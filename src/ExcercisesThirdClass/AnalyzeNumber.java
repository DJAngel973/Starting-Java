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
        
        //Se implementa el switch el cual se ejecuta de acuerdo a la opción que escoja el usuario.
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

                //Se implementa el operador terniario para determinar si el número es impar o par.
                System.out.printf("\tEl número %d es %s.\n",firstNumber, (residue != 0) ? "impar" : "par");
                
                if (firstNumber > 100){ //Determinamos si es mayor que 100.
                    System.out.printf("\tEl número %d es mayor que 100.\n",firstNumber);
                }else if (firstNumber < 100){ //Determinamos si es menor que 100.
                    System.out.printf("\tEl número %d es menor que 100.\n",firstNumber);
                }else{ //Determinamos que es igual a 100 ya que no cumple las condiciones anteriores.
                    System.out.printf("\tEl número %d es igual a 100.\n",firstNumber);
                }
                break;
            }
            case 2:{
                
                int initialNum; //Variable del número incial.
                int finalNum; //Variable del número final.
                String type;

                //Pedimos al usuario los números.
                System.out.println("2)Ingresa un número inicial:");
                initialNum = input.nextInt();
                System.out.println("Ingresa un número final:");
                finalNum = input.nextInt();

                //Limpiamos el bufer.
                input.nextLine();

                //Pedimos al usuario confirmar que si quiere ver números impares o pares.
                System.out.println("Ingresa que números quieres ver, 'par' o 'impar'.");
                type = input.nextLine();

                /*
                Implementamos bucle switch para poder determinar si es par o impar.
                El for para iterar con los valores dentro del rango de las variables initialNum y finalNum.
                */
                switch (type) {
                    case "impar":
                    for (int i = initialNum; i <= finalNum; i++){
                    
                        if (i % 2 == 0){ //Mostramos solo impares, salta cuando es par.
                            continue; //Implementamos continue para que salte el número que no coincide con la condición.
                        }
                    System.out.printf("El número %d es impar.\n",i);
                    }
                        break;
                    case "par":
                    for (int i = initialNum; i <= finalNum; i++){
                    
                        if (i % 2 != 0){ //Mostramos solo pares, salta cuando es impar
                            continue;
                        }
                        System.out.printf("El número %d es par.\n",i);
                    }
                        break;
                    default:
                        System.out.println("\nOpción no valida, escribe 'par' o 'impar'.");
                }
            }
                break;
            case 0:
                break;
            default:
                break;
        }
        input.close();
    }
}
