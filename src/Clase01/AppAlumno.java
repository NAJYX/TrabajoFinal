package Clase01;

import java.util.Scanner;

public class AppAlumno {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(20240001,"Luis Perea",20, 18);
        Alumno alumno2 = new Alumno(20240002, "Dogorcito Peredito", 16, 14);

        Alumno alumno3 = new Alumno();

        System.out.println("Codigo01: " + alumno1.getCodigo() + ", nombres: " + alumno1.getNombre() + " , nota 1:  " + alumno1.getNota1() + " , nota 2: " + alumno1.getNota2());

        System.out.println("El promedio del alumno 1 es: " + alumno1.calcularPromedio());
        System.out.println("El promedio del alumno 2 es: " + alumno2.calcularPromedio());

        //Ahora solicitar el ingreso de los datos del alumno
        //Scanner


        System.out.println("Alumno 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su codigo: ");
        int codigo;
        String nombre;
        int nota1;
        int nota2;

        System.out.println("Codigo: " + alumno3.getCodigo() + ", nombres: " + alumno3.getNombre() + " , nota 1:  " + alumno3.getNota1() + " , nota 2: " + alumno3.getNota2());
        System.out.println("El promedio del alumno 3 es: " + alumno3.calcularPromedio());




    }
}
