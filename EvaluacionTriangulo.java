import java.util.Scanner;
public class EvaluacionTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        double lado3 = scanner.nextDouble();
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Los lados ingresados SÍ forman un triángulo.");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es: EQUILÁTERO (Todos los lados iguales)");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es: ISÓSCELES (Dos lados iguales)");
            } else {
                System.out.println("El triángulo es: ESCALENO (Todos los lados diferentes)");
            }
        } else {
            System.out.println("Los lados ingresados NO forman un triángulo.");
        }
        scanner.close();
    }
}