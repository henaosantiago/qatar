package clases;

public class Tecnico extends  Personas {



    private  Double salario;


    public  Tecnico (){


    }

    public Tecnico(String id, String nombres, String apellidos, Integer edad, Double salario) {
        super(id, nombres, apellidos, edad);
        this.salario = salario;
    }
}
