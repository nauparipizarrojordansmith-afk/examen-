import java.util.Scanner;

public class SistemaAcceso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        String usuario = teclado.nextLine();

        System.out.print("Ingrese contraseña: ");
        String password = teclado.nextLine();

        if (usuario.equals("admin") && password.equals("1234")) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }

        teclado.close();
    }
}