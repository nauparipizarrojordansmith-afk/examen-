import java.util.Scanner;
public class DiasSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = teclado.nextInt();
        switch (dia) {
            case 1: System.out.print("Lunes - "); break;
            case 2: System.out.print("Martes - "); break;
            case 3: System.out.print("Miércoles - "); break;
            case 4: System.out.print("Jueves - "); break;
            case 5: System.out.print("Viernes - "); break;
            case 6: System.out.print("Sábado - "); break;
            case 7: System.out.print("Domingo - "); break;
            default: 
                System.out.println("❌ Número inválido.");
                return;
        }
        switch (dia) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Día laborable 💼");
                break;
            case 6: case 7:
                System.out.println("Fin de semana 🎉");
                break;
        }
        teclado.close();
    }
}