package Clase01;

import java.util.Scanner;
class Intro {

    public static void main(String[] args) {

        System.out.println("Hola Dogorcito, no me cagues");

        String nombre = "4to canbio";

        int edad = 26;
        double talla = 1.72;
        boolean tieneLicencia = false;
        char tieneLicenciaConducir = 'N';

        //Dogorcito tiene 26 años, mide 1.72 metros
        //(+): permite además de sumar valores concatenar cadenas de caracteres

        System.out.println(nombre + " tiene " + edad + " años, mide " + talla + " metros");


        //Solicitar a Dogorcito que ingrese su edad

        Scanner sc = new Scanner(System.in);

        System.out.print("Dogorcito, por favor ingresa tu edad: ");

        edad = sc.nextInt();

        System.out.print("Ingresa tu talla: ");

        talla = sc.nextDouble();

        System.out.println("Dogorcito tiene: " + edad + " años y mide " + talla + " metros");

    }

}
