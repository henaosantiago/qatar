package clases;

public class Personas {

    private String id;
    private String nombres ;
    private String apellidos;
    private Integer edad;

    public Personas() {


    }

    public Personas(String id, String nombres, String apellidos, Integer edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public  void saludar(){
        System.out.println("hola como estas ?");
    }
}
