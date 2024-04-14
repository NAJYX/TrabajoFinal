package Clase01;

public class Alumno {
    // comentario
    private int codigo;
    private String nombre;
    private int nota1;
    private int nota2;

    //Constructor
    //Con 4 parametros

    public Alumno(int codigo, String nombre, int nota1, int nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //Con 2 parametros

    public Alumno(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;

    }
    // Sin parametros


    public Alumno() {
    }

    //Get y Set generado de manera automatica  (Click Derecho)

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public double calcularPromedio(){
        double promedio = 0;
        promedio = (nota1 + nota2) / 2.0;
        return promedio;

    }
}
