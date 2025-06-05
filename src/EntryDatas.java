import javax.swing.JOptionPane;

public class EntryDatas {
    public static void main(String[] args) {

        //Data entry via pop-up window. -Entrada de datos por ventana emergente.
        String name = JOptionPane.showInputDialog("Digite el nombre.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad."));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Digite la altura."));
        double wage = Double.parseDouble(JOptionPane.showInputDialog("Digita el sueldo."));
        char letter = JOptionPane.showInputDialog("Digite la letra").charAt(0);

        //Data output via pop-up window. -Salida de datos por ventana emergente.
        JOptionPane.showMessageDialog(null, "El nombre es: " + name);
        JOptionPane.showMessageDialog(null, "La edad es: " + age + " años.");
        JOptionPane.showMessageDialog(null, "La estatura es: " + height + "mts.");
        JOptionPane.showMessageDialog(null, "El sueldo es: $" + wage);
        JOptionPane.showMessageDialog(null, "Letra ingresada es: " + letter);
    }
}
