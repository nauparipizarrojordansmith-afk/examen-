import java.util.Scanner;
public class CalculadoraImpuestos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Cálculo de Impuestos por Tramo ===");
        System.out.print("Ingrese el monto total para calcular: ");

        if (teclado.hasNextDouble()) {
            double monto = teclado.nextDouble();
            double impuesto = 0;
            double porcentaje = 0;

            if (monto < 0) {
                System.out.println("Error: El monto no puede ser negativo.");
            } else {
                if (monto <= 1000) {
                    porcentaje = 5;
                    impuesto = monto * 0.05;
                } else {
                    if (monto <= 5000) {
                        porcentaje = 10;
                        impuesto = monto * 0.10;
                    } else {
                        porcentaje = 20;
                        impuesto = monto * 0.20;
                    }
                }

                System.out.println("\n--- Reporte Fiscal ---");
                System.out.println("Monto ingresado: $" + monto);
                System.out.println("Tramo aplicado: " + porcentaje + "%");
                System.out.println("Total impuesto: $" + impuesto);
                System.out.println("Monto neto: $" + (monto - impuesto));
            }
        } else {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        }

        teclado.close();
    }
}