import javax.swing.*;

public class Entrada_segundo_ejemplo {
    public static void main(String[] args) {

        String Nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor ");

        String edad = JOptionPane.showInputDialog("Intruduce la edad por favor");

        int edad_usuario = Integer.parseInt(edad);

        edad_usuario++;

        System.out.println("Hola " + Nombre + ", el año que vienes tendras  " + edad_usuario + " años");









    }
}
