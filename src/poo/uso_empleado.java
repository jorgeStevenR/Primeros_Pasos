package poo;
import java.util.*;

public class uso_empleado {
    public static void main(String[] args) {

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
