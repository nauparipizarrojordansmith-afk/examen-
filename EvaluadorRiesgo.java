import java.util.Scanner;

public class EvaluadorRiesgo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("=== Sistema de Evaluación de Riesgo ===");

        System.out.print("Ingrese el monto de ingreso mensual: ");
        double ingreso = lector.nextDouble();

        System.out.print("Ingrese historial crediticio (bueno, regular, malo): ");
        String historial = lector.next();

        System.out.print("Ingrese la edad del cliente: ");
        int edad = lector.nextInt();

        String riesgo;

        if (historial.equalsIgnoreCase("malo")) {
            riesgo = "Alto";
        } else {
            if (historial.equalsIgnoreCase("regular")) {
                if (edad < 25) {
                    riesgo = "Alto";
                } else {
                    if (ingreso < 2500) {
                        riesgo = "Alto";
                    } else {
                        riesgo = "Medio";
                    }
                }
            } else {
                if (historial.equalsIgnoreCase("bueno")) {
                    if (edad < 21) {
                        riesgo = "Medio";
                    } else {
                        if (ingreso < 1500) {
                            riesgo = "Medio";
                        } else {
                            riesgo = "Bajo";
                        }
                    }
                } else {
                    riesgo = "Historial no válido";
                }
            }
        }

        System.out.println("\n---------------------------------");
        System.out.println("El nivel de riesgo detectado es: " + riesgo);
        System.out.println("---------------------------------");
        
        lector.close();
    }
}