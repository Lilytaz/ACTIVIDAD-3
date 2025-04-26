import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre = "LILY";
        byte edad = 20;
        short numeroDepartamento = 200;
        int cedula = 12345678;
        long telefono = 123456789L;
        float temperatura = 36.5f;
        double altura = 1.65;
        char genero = 'M';
        boolean esResidente = false;

        System.out.println("\n\tRegistro del Visitante");
        System.out.println("Nombre y apellido: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Numero de departamento: " + numeroDepartamento);
        System.out.println("Cedula o Pasaporte: " + cedula);
        System.out.println("Telefono o Celular: " + telefono);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Altura: " + altura);
        System.out.println("Genero: " + genero);
        System.out.println("¿Es usted un Residente?: " + (esResidente ? "Si" : "No"));

    }
}