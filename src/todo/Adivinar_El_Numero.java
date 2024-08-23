package todo;

import java.util.*;
public class Adivinar_El_Numero {
    public static void main(String[] args) {

        int aleatorio =(int)(Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int intentos = 0;

        while(numero!=aleatorio){

            intentos++;

            System.out.println("Introduzca un numero por favor");

            numero = entrada.nextInt();

            if(aleatorio<numero){

                System.out.println("Dame un numero menor ");


            } else if (aleatorio>numero) {
                System.out.println("Dame un numero mayor");

            }


        }
        System.out.println("Correcto");
        System.out.println("Desifraste el numero en " + intentos + " intentos");

    }

}
