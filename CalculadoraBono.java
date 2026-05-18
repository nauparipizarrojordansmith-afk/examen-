import java.util.Scanner;

public class CalculadoraBono {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los años de trabajo: ");
        int años = entrada.nextInt();

        System.out.print("Ingrese el salario: ");
        double salario = entrada.nextDouble();

        if (años > 5 && salario < 2000) {
            System.out.println("Resultado: Recibe Bono");
        } else if (años > 5 || salario > 2000) {
            System.out.println("Resultado: Recibe Bono menor");
        } else if (años < 5 || salario < 2000) {
            System.out.println("Resultado: Sin bono");
        }

        entrada.close();
    }
}