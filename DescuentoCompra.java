import java.util.Scanner;
public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: $");
        double monto = scanner.nextDouble();
        System.out.print("¿Es cliente VIP? (true/false): ");
        boolean esVip = scanner.nextBoolean();
        double descuento = 0.0;
        if (monto > 500 && esVip) {
            descuento = 0.20; // 20%
        } else if (monto > 500) {
            descuento = 0.10; // 10%
        }
        double valorDescuento = monto * descuento;
        double totalPagar = monto - valorDescuento;
        System.out.println("\n--- Resumen de su compra ---");
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + totalPagar);
        scanner.close();
    }
}