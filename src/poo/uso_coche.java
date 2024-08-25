package poo;
import javax.swing.*;
public class uso_coche {
		
    public static void main(String[] args) {

		coche mi_coche =new coche();

		mi_coche.establece_color(JOptionPane.showInputDialog("Introduce Color"));
    	
    	System.out.println(mi_coche.dime_datos_generales());
 
    	System.out.println(mi_coche.dime_color());
    	
    	mi_coche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
    	
    	System.out.println(mi_coche.dime_asientos());
    	
    	mi_coche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
    	
    	System.out.println(mi_coche.dime_climatizador());
    	
    	System.out.println(mi_coche.dime_peso_choche());
    	
    	System.out.println("El precio final del coche es: " + mi_coche.precio_coche() + '€');
    	

    	
    	
    	    	
    	
    	

    }
}
