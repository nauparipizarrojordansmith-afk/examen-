import java.util.Scanner;
public class ValidadorPassword {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Crea una contraseña: ");
        String password = teclado.nextLine();
        boolean tieneLargo = password.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneSimbolo = true;
            }
        }
        System.out.println("\n--- Análisis de Seguridad ---");
        if (tieneLargo && tieneMayuscula && tieneNumero && tieneSimbolo) {
            System.out.println("✅ Contraseña SEGURA y válida.");
        } else {
            System.out.println("❌ Contraseña INSEGURA. Faltan los siguientes requisitos:");
            if (!tieneLargo) {
                System.out.println("- Mínimo 8 caracteres (actual: " + password.length() + ")");
            }
            if (!tieneMayuscula) {
                System.out.println("- Al menos una letra MAYÚSCULA");
            }
            if (!tieneNumero) {
                System.out.println("- Al menos un NÚMERO");
            }
            if (!tieneSimbolo) {
                System.out.println("- Al menos un SÍMBOLO (ej: @, #, $, !)");
            }
        }
        teclado.close();
    }
}