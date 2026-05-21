import java.util.Scanner;
public class CalculadorTransporte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precioPorKm = 0.50;
        
        System.out.println("=== Sistema de Cálculo de Pasajes ===");

        System.out.print("Distancia a recorrer (km): ");
        double distancia = teclado.nextDouble();

        System.out.print("Tipo de usuario (1: Estudiante, 2: Adulto, 3: Adulto Mayor): ");
        int tipoUsuario = teclado.nextInt();

        System.out.print("Horario (1: Normal, 2: Nocturno): ");
        int horario = teclado.nextInt();

        if (distancia <= 0) {
            System.out.println("Error: Distancia no válida.");
        } else {
            double costoBase = distancia * precioPorKm;
            double descuento = 0.0;
            double recargo = 0.0;
            if (tipoUsuario == 1) { 
                if (horario == 1) {
                    descuento = 0.50; 
                } else {
                    descuento = 0.20; 
                }
            } else if (tipoUsuario == 3) { 
                descuento = 0.60; 
            } else { 
                if (horario == 2) {
                    recargo = 0.15; 
                }
                if (distancia > 100) {
                    descuento = 0.10; 
                }
            }
            double total = costoBase - (costoBase * descuento) + (costoBase * recargo);
            System.out.println("\n--- Detalle del Cobro ---");
            System.out.println("Costo base: $" + costoBase);
            if (descuento > 0) System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            if (recargo > 0) System.out.println("Recargo nocturno: " + (recargo * 100) + "%");
            System.out.println("TOTAL A PAGAR: $" + total);
        }
        teclado.close();
    }
}