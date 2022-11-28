package clases;

public class Jugador extends Personas {


    private  String posicion;
    private Integer NumeroCamisa;

    public Jugador() {



    }

    public Jugador(String id, String nombres, String apellidos, Integer edad, String posicion, Integer numeroCamisa) {
        super(id, nombres, apellidos, edad);
        this.posicion = posicion;
        this.NumeroCamisa = numeroCamisa;
    }
}
