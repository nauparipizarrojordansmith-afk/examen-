import java.util.Scanner;
public class ClasificadorNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la letra de la calificación (A-F): ");
        char letra = teclado.next().toUpperCase().charAt(0);
        switch (letra) {
            case 'A':
                System.out.println("⭐ Excelente");
                break;
            case 'B':
                System.out.println("✅ Bueno");
                break;
            case 'C':
                System.out.println("📈 Regular");
                break;
            case 'D':
                System.out.println("⚠️ Deficiente");
                break;
            case 'F':
                System.out.println("❌ Reprobado");
                break;
            default:
                System.out.println("🚫 Error: Letra no válida.");
        }
        teclado.close();
    }
}