import java.util.Scanner;
public class CalculadoraPro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- CALCULADORA ---");
        System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Potencia");
        System.out.print("Seleccione operación: ");
        int opcion = teclado.nextInt();
        System.out.print("Ingrese el primer número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = teclado.nextDouble();
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("❌ Error: no se puede dividir entre 0.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
                break;
            case 5:
                System.out.println("Resultado: " + Math.pow(n1, n2));
                break;
            default:
                System.out.println("⚠️ Opción no válida.");
        }
        teclado.close();
    }
}