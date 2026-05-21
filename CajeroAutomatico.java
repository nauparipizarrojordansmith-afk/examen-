import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pinCorrecto = 1234;
        double saldo = 5000.0;
        double limiteDiario = 2000.0;
        int intentosMaximos = 3;
        boolean accesoConcedido = false;
        System.out.println("=== BIENVENIDO AL CAJERO AUTOMÁTICO ===");
        for (int i = 1; i <= intentosMaximos; i++) {
            System.out.print("Ingrese su PIN (" + i + "/" + intentosMaximos + "): ");
            int pinIngresado = teclado.nextInt();
            if (pinIngresado == pinCorrecto) {
                accesoConcedido = true;
                break;
            } else {
                if (i < intentosMaximos) {
                    System.out.println("PIN incorrecto. Intente de nuevo.");
                } else {
                    System.out.println("Cuenta bloqueada por seguridad.");
                }
            }
        }
        if (accesoConcedido) {
            System.out.println("\n1. Verificar Saldo");
            System.out.println("2. Retirar Dinero");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("Su saldo actual es: $" + saldo);
            } 
            else if (opcion == 2) {
                System.out.print("Monto a retirar: $");
                double monto = teclado.nextDouble();
                if (monto > limiteDiario) {
                    System.out.println("Error: El monto excede el límite diario de $" + limiteDiario);
                } else {
                    if (monto > saldo) {
                        System.out.println("Error: Fondos insuficientes. Su saldo es: $" + saldo);
                    } else {
                        if (monto <= 0) {
                            System.out.println("Error: Monto no válido.");
                        } else {
                            saldo -= monto;
                            System.out.println("Retiro exitoso.");
                            System.out.println("Saldo restante: $" + saldo);
                        }
                    }
                }
            } else {
                System.out.println("Opción no válida.");
            }
        }
        System.out.println("\nGracias por usar nuestros servicios.");
        teclado.close();
    }
}