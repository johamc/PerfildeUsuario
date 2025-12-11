package perfilUsuario;

import java.util.Scanner;

public class validadorPerfilUsuario {

    public static void validador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese por favor su nombre completo: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese por favor su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese por favor el saldo de su cuenta: ");
        double saldoCuenta = scanner.nextDouble();

        System.out.println("¿Es usuario Premium? (si/no): ");
        String esPremiumTexto = scanner.next().toLowerCase();
        boolean esPremium = esPremiumTexto.equals("si");


        //  VARIABLES BOOLEANAS

        boolean accesoExclusivo = false;
        boolean calificaPromocion = false;
        boolean perfilIncompleto = false;
        boolean perfilActivoTotal = false;

        // Regla 1
        accesoExclusivo = (edad >= 18 && esPremium);

        // Regla 2
        calificaPromocion = (saldoCuenta > 1000 || edad < 25);

        // Regla 3
        perfilIncompleto = (saldoCuenta == 0 || !nombreUsuario.equals("invitado"));

        // Regla 4
        perfilActivoTotal = (!perfilIncompleto && (accesoExclusivo || calificaPromocion));

        // Resultados
        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Acceso Exclusivo: " + accesoExclusivo);
        System.out.println("Califica Promoción: " + calificaPromocion);
        System.out.println("Perfil Incompleto: " + perfilIncompleto);
        System.out.println("Perfil Activo Total: " + perfilActivoTotal);
    }
}

