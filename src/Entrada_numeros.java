import javax.swing.JOptionPane;



public class Entrada_numeros {
    public static void main(String[] args) {


        
        String num1 = JOptionPane.showInputDialog("Digite su numero");

        double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es " );

        System.out.printf("%1.2f", Math.sqrt(num2));









    }
}
