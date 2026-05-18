import java.util.Scanner;
public class CategoriaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoría: Niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Categoría: Adolescente");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Categoría: Adulto");
        } else if (edad >= 65) {
            System.out.println("Categoría: Adulto mayor");
        } else {
            System.out.println("Edad no válida. Ingresa un número positivo.");
        }
        scanner.close();
    }
}