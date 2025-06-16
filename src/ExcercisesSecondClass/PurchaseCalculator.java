package ExcercisesSecondClass;

import java.util.Scanner;

/*
* Ejercicio de crear una calculadora para una compra simple.
* Exercise to create a calculator for a simple purchase.
* */
public class PurchaseCalculator {
    public static void main(String[] args) {

        //Constante. -Constant.
        final double TAX_RATE = 0.19; //tasaInteres.

        //Tomar datos de usuario. -Take data of user.
        Scanner entry = new Scanner(System.in);

        //Se ingresa los datos y se crean las varibles. -Data is entered and variables are created.
        System.out.println("Ingresa el precio unitario del articulo: ");
        var unitPrice = entry.nextDouble(); //PrecioUnitario
        System.out.println("Ingresa cantidad de articulos comprados: ");
        var totalItems = entry.nextInt(); //TotalArticulos.
        System.out.println("Ingresa el monto con el que cancelas la compra: ");
        var pay = entry.nextDouble(); //Pago.
        entry.nextLine();

        //Operaciones. -Operations.
        var subtotal = unitPrice * totalItems; //Subtotal.
        var tax = subtotal * TAX_RATE; //Impuesto.
        var totalPurchase = subtotal + tax; //TotalCompra.
        var change = pay - totalPurchase; //Cambio.

        //Mostramos el resumen de la compra. -We show resume the of purchase.
        System.out.println("\n ----- Resumen de la compra. ----- ");
        System.out.printf("Subtotal: $%.2f%n",subtotal); //'%.2f' para redondear a 2 decimales, '%n' salto de linea.-'%.2f' to round to 2 decimal places, '%n' line break.
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TAX_RATE * 100, tax); //'%.0f%%' redondea a cero, %% para ver el signo porcentaje. -'%.0f%%' rounds to zero, %% to see the percentage sign.
        System.out.printf("Total compra: $%.2f%n", totalPurchase);
        System.out.printf("Cantidad pagada: $%.2f%n", pay);
        System.out.printf("Cambio: $%.2f%n", change);
        System.out.println(" ------------------------------ ");
        System.out.println("Gracias por la compra, te esperamos!!");

        //Cerrar Scanner para liberar recursos. -Close Scanner to free up resources.
        entry.close();
    }
}