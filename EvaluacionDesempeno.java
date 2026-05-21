import java.util.Scanner;
public class EvaluacionDesempeno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Sistema de Evaluación Laboral ===");
        System.out.print("Puntualidad (1-10): ");
        int puntualidad = teclado.nextInt();
        System.out.print("Productividad (1-10): ");
        int productividad = teclado.nextInt();
        System.out.print("Cumplimiento de metas (1-10): ");
        int cumplimiento = teclado.nextInt();
        if (puntualidad < 1 || puntualidad > 10 || productividad < 1 || productividad > 10 || cumplimiento < 1 || cumplimiento > 10) {
            System.out.println("Error: Los valores deben estar entre 1 y 10.");
        } else {
            double promedio = (puntualidad + productividad + cumplimiento) / 3.0;
            String categoria;
            if (promedio >= 9.0) {
                if (puntualidad >= 8) {
                    categoria = "Excelente";
                } else {
                    categoria = "Bueno";
                }
            } else {
                if (promedio >= 7.0) {
                    categoria = "Bueno";
                } else {
                    if (promedio >= 5.0) {
                        categoria = "Regular";
                    } else {
                        categoria = "Deficiente";
                    }
                }
            }
            System.out.println("\n--- Reporte Final ---");
            System.out.println("Promedio obtenido: " + String.format("%.2f", promedio));
            System.out.println("Clasificación: " + categoria);
            if (categoria.equals("Excelente") || categoria.equals("Bueno")) {
                System.out.println("Acción: Candidato a bono de desempeño.");
            } else {
                System.out.println("Acción: Plan de mejora requerido.");
            }
        }
        teclado.close();
    }
}