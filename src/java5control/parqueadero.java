package java5control;

import java.util.Scanner;

public class parqueadero {
    public static void ejercicio3() {
        System.out.println("\n-------PARQUEADERO---------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese por favor que tipo de Carro tiene: 1.auto, 2.moto, 3.bicicleta  ");
        int vehiculo = scanner.nextInt();

        int auto = 5000;
        int moto = 3000;
        int bicicleta = 1000;

        System.out.println("Cuál es su hora de llegada en formato de 24 horas:  ");
        int horaLlegada = scanner.nextInt();

        int precioBase;

        if (vehiculo == 1) {
            precioBase = auto;
        } else if (vehiculo == 2) {
            precioBase = moto;
        } else {
            precioBase = bicicleta;
        }

        System.out.println("El valor base es: " + precioBase);

        double precioFinal = precioBase;

        if (horaLlegada >= 20) {
            System.out.println("Recargo nocturno del 20% aplicado.");
            precioFinal = precioBase * 1.20; // 20% más
        }

        System.out.println("El precio final a pagar es: " + precioFinal);
    }
}
