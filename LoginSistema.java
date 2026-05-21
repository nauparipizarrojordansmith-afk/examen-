import java.util.Scanner;
public class LoginSistema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String claveCorrecta = "12345";
        int intentos = 0;
        int maxIntentos = 3;
        boolean accesoExitoso = false;
        System.out.println("=== Acceso al Sistema ===");
        while (intentos < maxIntentos && !accesoExitoso) {
            System.out.print("Usuario: ");
            String user = teclado.next();
            System.out.print("Contraseña: ");
            String pass = teclado.next();
            intentos++;
            if (user.equals(usuarioCorrecto) && pass.equals(claveCorrecta)) {
                accesoExitoso = true;
            } else {
                if (intentos < maxIntentos) {
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + (maxIntentos - intentos));
                    System.out.println("-------------------------");
                } else {
                    System.out.println("-------------------------");
                    System.out.println("ALERTA: Cuenta bloqueada por seguridad.");
                }
            }
        }
        if (accesoExitoso) {
            System.out.println("\n¡Bienvenido al sistema, " + usuarioCorrecto + "!");
        } else {
            System.out.println("Comuníquese con el administrador para desbloquear su usuario.");
        }
        teclado.close();
    }
}