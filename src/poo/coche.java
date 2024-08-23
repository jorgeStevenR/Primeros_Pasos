package poo;
public class coche {

    private int rueda;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;
    
    private String color;
    
    private int peso_total;
    
    private boolean asientos_cuero, climatizador;
    
    
    

    public coche(){

        rueda = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;

    }
    
    // GETTER siempre tiene que llevar el tipo de dato el nombre del getter y un return
    public String dime_datos_generales() { 
    	
    	return "La plataforma del vehiculo tiene " + rueda + " Ruedas" +
    	". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm " +
    	"y un peso de plataforma de " + peso_plataforma + " kg";
    	
    }
    
    // SETTER 
    
    public void establece_color (String color_coche) {
    	
    	color = color_coche;
    	
    }
    
    //Getter
    
    public String dime_color() {
    	
    	return "El color del coche es " + color;
    	
   
    }
    
    //Setter
    public void configura_asientos(String asientos_cuero) {
    	
    	if (asientos_cuero.equalsIgnoreCase("si")) {	
    		this.asientos_cuero = true;
    	}else {
    		this.asientos_cuero = false;
    	}
    	
    	
    	
    }
    
    //Getter
    public String dime_asientos() {
    	
    	if (asientos_cuero==true) {
    		
    		return "El coche tiene asientos de cuero";
    	}else {
    		return "El coche tiene asientos de serie";
    		
    	}
    		
    }
    
    public void configura_climatizador(String climatizador) {
    	
    	if(climatizador.equalsIgnoreCase("si")) {
    		this.climatizador=true;
    	}else {	
    		this.climatizador=false;
    	}
    	
    }
    
    public String dime_climatizador() {
    	
    	if(climatizador == true) {
    		return "El coche tiene climatizador";			
    	}else {
    		return "El coche lleva aire acondicionado";
    	}
    	
    }
    
    
    //GetterySetter
    public String dime_peso_choche() {
    	
    	int peso_carroceria=500;
    	
    	peso_total=peso_plataforma+peso_carroceria;
    	
    	if(asientos_cuero == true) {
    		peso_total=peso_total+50;
    	}
    	if(climatizador == true) {
    		peso_total=peso_total+20;
    	}
    		
    	return "El peso del coche es " + peso_total;
    		
    }
    
    
    //Getter
    public int precio_coche() {
    	
    	int precio_final=10000;
    	
    	if(asientos_cuero== true) {
    		precio_final+=2000;
    	}
    	
    	if(climatizador == true) {
    		precio_final+=1500;   	
    	}
    	
    	return precio_final;
    	
    }



}
