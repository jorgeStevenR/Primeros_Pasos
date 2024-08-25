package poo;
import java.util.*;

public class uso_empleado {
    public static void main(String[] args) {

        /*
        empleado empleado1 = new empleado("Laura Cruz", 85000, 1990, 12, 17);
        empleado empleado2 = new empleado("Jorge Steven", 95000, 1995, 9, 2);
        empleado empleado3 = new empleado("Roberto Duran", 65000, 2003, 2, 24);

        empleado1.aunmento_sueldo(5);
        empleado1.aunmento_sueldo(5);
        empleado1.aunmento_sueldo(5);

        System.out.println("Nombre " + empleado1.dame_nombre() + " sueldo : " + empleado1.dame_sueldo()
        + " Fecha de alta " + empleado1.dame_alta_contrato());

        System.out.println("Nombre " + empleado2.dame_nombre() + " sueldo : " + empleado2.dame_sueldo()
                + " Fecha de alta " + empleado2.dame_alta_contrato());

        System.out.println("Nombre " + empleado3.dame_nombre() + " sueldo : " + empleado3.dame_sueldo()
               + " Fecha de alta " + empleado3.dame_alta_contrato());*/

        empleado [] misEmpleados = new empleado[3];

        misEmpleados[0] =new empleado("Paco Gomez",85000,1990,12,17);
        misEmpleados[1] =new empleado("Jorge Rodriguez",90000,1995,5,7);
        misEmpleados[2] =new empleado("Laura Cruz",95000,2003,10,23);

        /*
        for (int i = 0; i<3; i++){

            misEmpleados[i].aunmento_sueldo(5);
        }

        for (int i = 0; i<3; i++){

            System.out.println("Nombre " + misEmpleados[i].dame_nombre() + " sueldo : " + misEmpleados[i].dame_sueldo()
                    + " Fecha de alta " + misEmpleados[i].dame_alta_contrato());


        }

         */

        for(empleado e: misEmpleados) {

            e.aunmento_sueldo(5);

        }

        for(empleado e: misEmpleados) {

            System.out.println("Nombre " + e.dame_nombre() + " sueldo : " + e.dame_sueldo()
                    + " Fecha de alta " + e.dame_alta_contrato());
        }





    }
}

class empleado{

    // constructor
    public empleado(String nom, double sue, int year, int mes , int dia){

        nombre = nom;

        sueldo = sue;

        GregorianCalendar caledario = new GregorianCalendar(year,mes-1,dia);

        alta_contrato = caledario.getTime();




    }

    public String dame_nombre(){ //metodo Getter
        return nombre;
    }

    public double dame_sueldo(){//Getter
        return sueldo;
    }

    public Date dame_alta_contrato(){//Getter
        return alta_contrato;
    }

    public void aunmento_sueldo(double porcentaje){ //Setter

        double aumento = sueldo * (porcentaje/100);

        sueldo += aumento;

    }



    private String nombre;

    private double sueldo;

    private Date alta_contrato;

}
