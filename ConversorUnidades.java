import java.util.Scanner;
public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("--- CONVERSOR DE UNIDADES ---");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Elija una opción: ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese metros: ");
                double metros = teclado.nextDouble();
                System.out.println(metros + " m equivalen a " + (metros / 1000) + " km.");
                break;
            case 2:
                System.out.print("Ingrese kilómetros: ");
                double km = teclado.nextDouble();
                System.out.println(km + " km equivalen a " + (km * 1000) + " m.");
                break;
            case 3:
                System.out.print("Ingrese grados Celsius: ");
                double celsius = teclado.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F.");
                break;
            case 4:
                System.out.print("Ingrese grados Fahrenheit: ");
                double fahr = teclado.nextDouble();
                double cel = (fahr - 32) * 5 / 9;
                System.out.println(fahr + " °F equivalen a " + cel + " °C.");
                break;
            default:
                System.out.println("⚠️ Opción no válida.");
        }
        teclado.close();
    }
}