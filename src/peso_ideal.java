import javax.swing.*;
public class peso_ideal {
    public static void main(String[] args) {

        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero ( H / M ) : ");

        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);


    }
}
