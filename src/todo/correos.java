package todo;

import javax.swing.*;

public class correos {
    public static void main(String[] args) {

        int arroba = 0;

        boolean punto =false;

        String main = JOptionPane.showInputDialog("Introduce tu correo electronico");

        for (int i = 0; i < main.length(); i++) {

            if(main.charAt(i) == '@') {
                arroba++;
            }

            if(main.charAt(i) == '.') {

                punto=true;
            }

        }
        if(arroba == 1 && punto == true ){
            System.out.println("Tu correo es correcto");
        }else {
            System.out.println("Tu correo es incorrecto");
        }

    }
}
