package poo;

public class pruebas {

    public static void main(String[] args) {

        empleados trabajador1 =new empleados("Paco");
        empleados trabajador2 =new empleados("Carlos");
        empleados trabajador3 =new empleados("Antonio");
        empleados trabajador4 =new empleados("Maria");

        trabajador1.cambiaSeccion("RRHH");

       System.out.println(trabajador1.daDatos() + "\n" + trabajador2.daDatos() + "\n" + trabajador3.daDatos() + "\n" + trabajador4.daDatos() + "\n" + empleados.dameIdSiguiente());


    }


}

class empleados {

    private final String nombre;

    private String seccion;

    private int Id;

    private static int Idsiguiente=1;



    public empleados(String nom){

        nombre =nom;

        seccion ="Administracion";

        Id=Idsiguiente;

        Idsiguiente++;

    }

    public void cambiaSeccion(String seccion){

        this.seccion =seccion;

    }

    public String daDatos(){

        return "El nombre es " + nombre + " y la seccion es " + seccion + " y la identificacion es igual a : " + Id;
    }

    public static String dameIdSiguiente(){

        return "El ID siguiente es " + Idsiguiente;

    }


}
