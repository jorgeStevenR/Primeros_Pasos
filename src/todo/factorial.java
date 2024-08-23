package todo;

import javax.swing.*;
public class factorial {
    public static void main(String[] args) {

        Long resultado = 1L;
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        for (int i = numero; i > 0; i--){

            resultado = resultado * i;


        }

        System.out.println("El factorial de " + numero + " es " + resultado);

    }

}

