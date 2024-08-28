package poo;
import javax.swing.*;
public class uso_coche {
		
    public static void main(String[] args) {

		/*

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

		 */

		coche mi_coche1 = new coche();

		mi_coche1.establece_color("Rojo");

		Furgoneta mi_furgoneta1 = new Furgoneta(7, 580);

		mi_furgoneta1.establece_color("Amarillo");

		mi_furgoneta1.configura_asientos("Si");

		mi_furgoneta1.configura_climatizador("Si");
    	
    	System.out.println(mi_coche1.dime_datos_generales() + " " + mi_furgoneta1.dime_color());

		System.out.println(mi_furgoneta1.dime_datos_generales() + " "+ mi_furgoneta1.dime_datos_furgoneta());

    	    	
    	
    	

    }
}
