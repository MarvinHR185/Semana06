import java.util.Scanner;

public class Semana06_SumaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese números positivos para sumar. Ingrese un número negativo para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
        }

        System.out.println("La suma de los números positivos es: " + suma);
    }
}

