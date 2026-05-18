import java.util.Scanner;
public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su contraseña (número): ");
        int password = sc.nextInt();
        String resultado = (password > 1000 && password < 9999) 
            ? "Contraseña válida" 
            : "Contraseña inválida";
        System.out.println(resultado);
        sc.close();
    }
}