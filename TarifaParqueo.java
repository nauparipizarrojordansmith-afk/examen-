import java.util.Scanner;
public class TarifaParqueo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioPorHora = 0;
        String tipo = "";
        System.out.println("--- SISTEMA DE TARIFAS ---");
        System.out.println("1. Moto\n2. Auto\n3. Camión");
        System.out.print("Seleccione vehículo: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                tipo = "Moto";
                precioPorHora = 5.0;
                break;
            case 2:
                tipo = "Auto";
                precioPorHora = 10.0;
                break;
            case 3:
                tipo = "Camión";
                precioPorHora = 20.0;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        System.out.print("Ingrese cantidad de horas: ");
        int horas = teclado.nextInt();
        if (horas > 0) {
            double total = horas * precioPorHora;
            System.out.println("\n--- RESUMEN ---");
            System.out.println("Vehículo: " + tipo);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("Error: Monto de horas no válido.");
        }
        teclado.close();
    }
}