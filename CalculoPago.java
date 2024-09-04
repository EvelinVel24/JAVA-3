import java.util.Scanner;

public class CalculoPago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar los 5 valores de compra
        double totalPago = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el valor del producto " + i + ": ");
            totalPago += scanner.nextDouble();
        }

        // Determinar el tipo de pago según el total
        if (totalPago <= 10000) {
            System.out.println(nombre + ", pagarás en efectivo el total de: $" + totalPago);
        } else if (totalPago > 10000 && totalPago <= 20000) {
            System.out.println(nombre + ", pagarás con tarjeta el total de: $" + totalPago);
        } else {
            System.out.println(nombre + ", pagarás con cheque el total de: $" + totalPago);
        }

        scanner.close();
    }
}

