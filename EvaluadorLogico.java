import java.util.Scanner;
public class EvaluadorLogico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese operador (AND, OR, XOR): ");
        String operador = teclado.next().toUpperCase();
        System.out.print("Ingrese primer valor booleano (true/false): ");
        boolean a = teclado.nextBoolean();
        System.out.print("Ingrese segundo valor booleano (true/false): ");
        boolean b = teclado.nextBoolean();
        System.out.print("Resultado: ");
        switch (operador) {
            case "AND":
                System.out.println(a && b);
                break;
            case "OR":
                System.out.println(a || b);
                break;
            case "XOR":
                System.out.println(a ^ b);
                break;
            default:
                System.out.println("Operador no reconocido.");
        }
        teclado.close();
    }
}