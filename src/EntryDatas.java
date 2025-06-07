import javax.swing.JOptionPane;

public class EntryDatas {
    public static void main(String[] args) {

        //Data entry via pop-up window. -Entrada de datos por ventana emergente.

        String name = JOptionPane.showInputDialog("Digite el nombre.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad."));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura."));
        double wage = Double.parseDouble(JOptionPane.showInputDialog("Digita el sueldo."));
        char letter = JOptionPane.showInputDialog("Digite la letra").charAt(0);

        /*
        * JOptionPane nos permite interactuar con distintos tipos de datos y poder mostrar los datos en pantalla
        * mediante ventanas emergentes.
        * JOptionPane.showInputDialog() toma el valor ingresado por el usuario de tipo String.
        * Integer.parseInt(JOptionPane.showInputDialog()) toma el valor ingresado de tipo entero.
        * con showInputDialog() se devuelve un String, para poder convertirlo en entero usamos Integer.parseInt()
        * si el usuario llega a ingresar algo que no sea entero, se lanzará una excepcion NumberFormaException
        * con Float.parseInt convierte el dato en float
        * Double.parseDouble() convierte el dato en double
        * como showInputDialog() ya genera un String usamos .charAT() para tomar un caracter, el número que ingresemos
        * dentro del parentesis va a ser la posicion deseada.
        */

        //Data output via pop-up window. -Salida de datos por ventana emergente.

        JOptionPane.showMessageDialog(null, "El nombre es: " + name);
        JOptionPane.showMessageDialog(null, "La edad es: " + age + " años.");
        JOptionPane.showMessageDialog(null, "La estatura es: " + height + "mts.");
        JOptionPane.showMessageDialog(null, "El sueldo es: $" + wage);
        JOptionPane.showMessageDialog(null, "Letra ingresada es: " + letter);

        /*
        * JOptionPane.showMessageDialog() este metodo nos genera una ventana emergente con el contenido
        * el null indica que la ventana no esta asociada a otro elemento
        * */

    }
}
