import java.util.Scanner;

public class Semana06_PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.println("Ingrese números para calcular el promedio. Ingrese un cero para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        if (contador != 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}
