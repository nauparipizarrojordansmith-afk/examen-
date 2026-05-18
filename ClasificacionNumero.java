import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        String clasificacion = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";

        String paridad = (numero != 0) ? ((numero % 2 == 0) ? "par" : "impar") : "n/a";

        System.out.println("El número es " + clasificacion + " y es " + paridad + ".");

        scanner.close();
    }
}