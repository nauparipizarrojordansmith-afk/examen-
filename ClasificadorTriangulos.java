import java.util.Scanner;
public class ClasificadorTriangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Clasificador de Triángulos ===");
        
        System.out.print("Lado A: ");
        double a = teclado.nextDouble();
        
        System.out.print("Lado B: ");
        double b = teclado.nextDouble();
        
        System.out.print("Lado C: ");
        double c = teclado.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {            
            if (a == b && b == c) {
                System.out.println("Resultado: Triángulo Equilátero (3 lados iguales)");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("Resultado: Triángulo Isósceles (2 lados iguales)");
                } else {
                    System.out.println("Resultado: Triángulo Escaleno (0 lados iguales)");
                }
            }   
        } else {
            System.out.println("Resultado: Triángulo INVÁLIDO");
            System.out.println("Nota: Un lado no puede ser mayor o igual a la suma de los otros dos.");
        }
        teclado.close();
    }
}