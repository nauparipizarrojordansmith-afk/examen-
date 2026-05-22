import java.util.Scanner;
public class ControlAcceso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- SISTEMA DE PERMISOS ---");
        System.out.print("Ingrese tipo de usuario (ADMIN, USER, GUEST): ");
        String rol = teclado.next().toUpperCase();
        switch (rol) {
            case "ADMIN":
                System.out.println("Acceso total: Puedes crear, editar y eliminar.");
                break;
            case "USER":
                System.out.println("Acceso parcial: Puedes editar tu perfil y ver contenido.");
                break;
            case "GUEST":
                System.out.println("Solo lectura: Solo puedes ver el contenido público.");
                break;
            default:
                System.out.println("Rol no reconocido. Acceso denegado.");
        }
        teclado.close();
    }
}