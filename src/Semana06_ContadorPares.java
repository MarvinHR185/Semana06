import java.util.Scanner;

public class Semana06_ContadorPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Ingrese números pares. Ingrese un número impar para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero % 2 != 0) {
                break;
            }

            contador++;
        }

        System.out.println("La cantidad de números pares ingresados es: " + contador);
    }
}
