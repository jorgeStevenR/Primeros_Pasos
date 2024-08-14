import java.util.Scanner;
public class Entrada_primer_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor.");
		
		String nombre = entrada.nextLine();
		
		System.out.println("introduce edad");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre + " el año que viene tendras " + ( edad + 1 ) + " años");
		 
		
		
		

	}

}
