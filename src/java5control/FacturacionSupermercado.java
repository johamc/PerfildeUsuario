package java5control;

import java.util.Scanner;

public class FacturacionSupermercado {

    public static void  ejercicio1() {
        System.out.println("\n-------SUPERMERCADO---------");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el valor de la compra: ");
        double precioCompra = scanner.nextDouble();

        System.out.println("¿Cuántos productos compro?: ");
        int cantidadProductos = scanner.nextInt();

        System.out.println("¿Tiene membresía? (si/no): ");
        String respuesta = scanner.next().toLowerCase();
        boolean tieneMembresia = respuesta.equals("si");


        // variable donde iremos aplicando descuentos
        double precioFinal = precioCompra;

        // 1. Descuento por cantidad
        if (cantidadProductos >= 10) {
            System.out.println("Descuento por cantidad: 5%");
            precioFinal = precioFinal * 0.95;  // aplica 95%
        }

        // 2. Descuento por membresía
        if (tieneMembresia) {
            System.out.println("Descuento por membresía: 10%");
            precioFinal = precioFinal * 0.90;  // aplica 90%
        }

        // Resultado final
        System.out.println("El precio final a pagar es: " + precioFinal);
    }
}