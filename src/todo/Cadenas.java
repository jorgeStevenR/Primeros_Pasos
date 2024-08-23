package todo;

public class Cadenas {
	public static void main(String[] args) {

		String nombre = "Jorge";

		System.out.println("Mi nombre es " + nombre);

		System.out.println("Mi nombre tiene " + nombre.length() + " letras");

		System.out.println("La primera letra de tu nombre " + " ' " + nombre + " '"+ " es " + nombre.charAt(0));

		int ultima_letra;

		ultima_letra = nombre.length();

		System.out.println("La ultima letra de tu nombre " + " ' " + nombre + " '"+ " es " + nombre.charAt(ultima_letra-1));




	}




}

