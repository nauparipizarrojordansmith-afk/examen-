import java.util.Scanner;
public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- MENÚ PRINCIPAL ---");
        System.out.println("1. Desayuno\n2. Almuerzo\n3. Cena");
        System.out.print("Seleccione una opción: ");
        int categoria = teclado.nextInt();
        switch (categoria) {
            case 1:
                System.out.println("\n--- DESAYUNOS ---");
                System.out.println("1. Huevos Rancheros\n2. Panqueques");
                System.out.print("Elija su plato: ");
                int subDesayuno = teclado.nextInt();
                switch (subDesayuno) {
                    case 1: System.out.println(" Huevos Rancheros - Precio: $8.50"); break;
                    case 2: System.out.println(" Panqueques - Precio: $6.00"); break;
                    default: System.out.println(" Plato no disponible.");
                }
                break;
            case 2:
                System.out.println("\n--- ALMUERZOS ---");
                System.out.println("1. Lasaña\n2. Arroz con Pollo");
                System.out.print("Elija su plato: ");
                int subAlmuerzo = teclado.nextInt();
                switch (subAlmuerzo) {
                    case 1: System.out.println(" Lasaña - Precio: $12.00"); break;
                    case 2: System.out.println(" Arroz con Pollo - Precio: $10.50"); break;
                    default: System.out.println(" Plato no disponible.");
                }
                break;
            case 3:
                System.out.println("\n--- CENAS ---");
                System.out.println("1. Ensalada César\n2. Tacos de Res");
                System.out.print("Elija su plato: ");
                int subCena = teclado.nextInt();
                switch (subCena) {
                    case 1: System.out.println(" Ensalada César - Precio: $9.00"); break;
                    case 2: System.out.println(" Tacos de Res - Precio: $11.00"); break;
                    default: System.out.println(" Plato no disponible.");
                }
                break;
            default:
                System.out.println("⚠️ Categoría no válida.");
        }
        teclado.close();
    }
}