import java.util.Scanner;
public class EvaluacionNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        double n1 = teclado.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double n2 = teclado.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double n3 = teclado.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("Promedio: " + promedio);
        if (promedio >= 11) {
            System.out.println("Estado: APROBADO");
        } else if (promedio > 8) {
            System.out.println("Estado: RECUPERACIÓN");
        } else {
            System.out.println("Estado: DESAPROBADO");
        }
        teclado.close();
    }
}