package poo;

public class Furgoneta extends coche{

    private int capadiad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capadiad_carga){

        super(); //esto llama al constructor de la clase padre " coche "

        this.capadiad_carga = capadiad_carga;
        this.plazas_extra = plazas_extra;

    }

    public String dime_datos_furgoneta(){

        return "La capacidad de carga es " + capadiad_carga + " y las plazas son " + plazas_extra;
    }


}

