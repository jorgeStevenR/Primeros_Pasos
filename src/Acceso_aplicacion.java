import javax.swing.*;
public class Acceso_aplicacion {
    public static void main(String[] args) {

        String clave ="Jorge";

        String pass ="";

        while(clave.equals(pass) == false){

            pass = JOptionPane.showInputDialog("Ingrese su Clave");

            if(clave.equals(pass) == false){

                System.out.println("Clave incorrecta ");

            }

        }

        System.out.println("Clave correcta");







    }
}
