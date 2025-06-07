import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        /*
         * if(Condicion){
         *    Instrucciones
         * }
         * else if(Condicion){
         *    Instrucciones
         * }
         * else{
         *    Instrucciones
         * }
         */

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite el número: ");
        int number = entry.nextInt();

        try {
            //Conditional implement. -Implementar condicionales.
            if (number == 0) {
                System.out.println("EL número " + number + " es nulo.");
            } else if (number > 0) {
                System.out.println("EL número " + number + " es positivo.");
            } else {
                System.out.println("El número " + number + " es negativo.");
            }
        }catch (Exception error) {
            System.out.print("Error: El número ingresado no es un entero valido.");
        }

        /*
        * if es la condición principal, solo si la condición es verdadera se ejecuta
        * en este caso si es identico a cero va a imprimir "EL número " + number + " es nulo."
        * else if es la condición secundaria, este proceso trabaja en cadena por ende si no se cumple
        * la primera condición del if, sigue analizando esta condición, de acuerdo a la operacion que tenemos
        * si no es cero salta a esta condición que evalua si el número es mayor a cero, si es correcto imprimi
        * la linea "EL número " + number + " es positivo."
        * else, se puede decir que es la condición final, el cual si no se cumple ninguna de las anteriores condiciones,
        * este verifica si es verdad para ejecutarse, dado el ejemplo seria verdad si es menor que cero.
        *
        * Agremos un try-catch para tomar algun error que se produsca, en este caso el mas seguro es que no ingrese
        * un número entero.
        * */

    }
}
