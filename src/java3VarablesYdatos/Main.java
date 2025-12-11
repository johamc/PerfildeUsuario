package java3VarablesYdatos;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----VARIABLES-----");

        //DECLARANDO VARIABLES

        int temper = 30;

        System.out.println("La temperatura es: " + temper);


        System.out.println("-----TIPOS DE ENTEROS-----");

        byte miByte = 127;
        short miShort = 32000;
        int miNumero = 10000;

        long longNumero = 800000000000L;

        System.out.println("-----DATOS PRIMITIVOS-----");

        float numFlotante = 1.2345f;
        double numeroDoble = 0.345664;

        boolean isTrue = true;
        boolean isFalse = false;


        char caracter = 'A'; //COMILLAS SIMPLES


        System.out.println("\n----CONVERSION DE DATOS-----");

        double notaFinal = 3.5;
        int notaDefinitiva = (int) notaFinal;

        System.out.println(notaDefinitiva);

        System.out.println("-----INTERACCION-----");

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIME TU EDAD: ");
        int edad = scanner.nextInt();

        //limpiar

        scanner.nextLine();

    }
}
