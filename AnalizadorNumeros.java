import java.util.Scanner;
public class AnalizadorNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = teclado.nextInt();
        System.out.println("\n=== Análisis del número " + num + " ===");
        if (num > 0) {
            System.out.println("• Signo: Es un número POSITIVO");
        } else {
            if (num < 0) {
                System.out.println("• Signo: Es un número NEGATIVO");
            } else {
                System.out.println("• Signo: Es CERO");
            }
        }
        if (num % 2 == 0) {
            System.out.println("• Paridad: Es PAR");
        } else {
            System.out.println("• Paridad: Es IMPAR");
        }
        if (num != 0) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("• Multiplicidad: Es múltiplo de AMBOS (3 y 5)");
            } else {
                if (num % 3 == 0) {
                    System.out.println("• Multiplicidad: Es múltiplo de 3 únicamente");
                } else if (num % 5 == 0) {
                    System.out.println("• Multiplicidad: Es múltiplo de 5 únicamente");
                } else {
                    System.out.println("• Multiplicidad: No es múltiplo ni de 3 ni de 5");
                }
            }
        } else {
            System.out.println("• Multiplicidad: El cero es múltiplo universal.");
        }
        teclado.close();
    }
}