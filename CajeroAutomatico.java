import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar: ");
                    double deposito = teclado.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("❌ Error: El monto debe ser mayor a 0.");
                    } else {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso.");
                    }
                    break;
                case 2:
                    System.out.print("Monto a retirar: ");
                    double retiro = teclado.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("❌ Error: Monto inválido.");
                    } else if (retiro > saldo) {
                        System.out.println("❌ Error: Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("✅ Retiro exitoso.");
                    }
                    break;
                case 3:
                    System.out.println("💰 Tu saldo actual es: $" + saldo);
                    break;

                case 4:
                    System.out.println("👋 Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        }
        teclado.close();
    }
}