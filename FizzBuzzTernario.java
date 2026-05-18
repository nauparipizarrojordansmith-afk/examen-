import java.util.Scanner;
public class FizzBuzzTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();

        String resultado = (n % 3 == 0 && n % 5 == 0) ? "FizzBuzz" 
                         : (n % 3 == 0) ? "Fizz" 
                         : (n % 5 == 0) ? "Buzz" 
                         : String.valueOf(n);
        System.out.println(resultado);
        sc.close();
    }
}
