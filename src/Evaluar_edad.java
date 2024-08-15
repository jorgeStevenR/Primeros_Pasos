import java.util.Scanner;
public class Evaluar_edad {
    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);

        System.out.print("Ingresa tu edad, por favor ");

        int edad = entrada.nextInt();

        if (edad<18){

            System.out.println("Eres un adolescente");

        }else if(edad < 40 ){

            System.out.println("Eres joven ");

        } else if (edad < 65){
            System.out.println("Eres viejo");

        } else {
            System.out.println("Eres anciano ");
        }








    }
}
