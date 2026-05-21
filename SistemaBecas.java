import java.util.Scanner;
public class SistemaBecas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Evaluación de Solicitud de Beca ===");

        System.out.print("Ingrese el promedio del estudiante (0-20): ");
        double promedio = teclado.nextDouble();

        System.out.print("¿Los ingresos familiares son bajos? (true/false): ");
        boolean ingresosBajos = teclado.nextBoolean();

        System.out.print("Ingrese el número de cursos desaprobados: ");
        int desaprobados = teclado.nextInt();

        if (desaprobados == 0 && (promedio >= 16 || ingresosBajos)) {
            if (promedio >= 18 && ingresosBajos) {
                System.out.println("Resultado: Beca COMPLETA (Excelencia Académica y Apoyo Social)");
            } else {
                if (promedio >= 16) {
                    System.out.println("Resultado: Beca PARCIAL por Mérito Académico");
                } else {
                    System.out.println("Resultado: Beca PARCIAL por Apoyo Socioeconómico");
                }
            }
        } else {
            if (desaprobados > 0 || promedio < 11) {
                System.out.println("Resultado: Solicitud RECHAZADA (No cumple requisitos mínimos)");
            } else {
                System.out.println("Resultado: En lista de espera (Cumple perfil básico)");
            }
        }
        teclado.close();
    }
}