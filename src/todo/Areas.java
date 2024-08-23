package todo;

import java.util.*;
import javax.swing.*;
public class Areas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opcion : \n1 : Cuadrado \n2 : Rectangulo \n3 : Triangulo \n4 : Circulo " );

        int figura = entrada.nextInt();

        switch (figura){

            case 1:

                int lado =Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado : "));

                System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

                break;


            case 2:

                int largo =Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo : "));
                int ancho =Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho : "));

                System.out.println("El area del Rectangulo es " + (largo*ancho));

                break;

            case 3:

                int base =Integer.parseInt(JOptionPane.showInputDialog("Introduce la base : "));
                int altura =Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura : "));

                System.out.println("El area del un Triangulo es " + (base*altura)/2 );

                break;

            case 4:

                int radio =Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio : "));
                System.out.println("El area del cuadrado es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                break;

            default:

                System.out.println("La opcion no es correcta ");

        }








    }
}
