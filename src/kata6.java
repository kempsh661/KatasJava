import java.util.Scanner;

public class kata6 {
    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para los acumuladores y contadores
        int totalClientes = 0;
        int contadorHorasValidas = 0;

        // Variables para registrar la hora con más clientes (Máximo)
        int maxClientes = -1; // Empezamos en -1 para que cualquier primer ingreso sea mayor
        int horaMasClientes = -1;

        // Bucle while
        while (true) {
            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            int hora = scanner.nextInt();

            // Si el usuario ingresa -1, el bucle se detiene inmediatamente
            if (hora == -1) {
                break;
            }

            System.out.print("Ingresa el número de clientes en esa hora: ");
            int clientes = scanner.nextInt();

            // Se acumulan los datos en nuestras variables básicas
            totalClientes += clientes;
            contadorHorasValidas++;

            // Lógica para encontrar la hora pico
            if (clientes > maxClientes) {
                maxClientes = clientes;
                horaMasClientes = hora;
            }
        }

        System.out.println("Reporte de Clientes");

        // Total de clientes
        System.out.println("Total de clientes: " + totalClientes);

        // Calculo del promedio
        if (contadorHorasValidas > 0) {
            double promedio = (double) totalClientes / contadorHorasValidas;
            System.out.printf("Promedio por hora:" + promedio);

            // Mostramos la hora con más clientes
            System.out.println("Hora con más clientes: " + horaMasClientes + " (" + maxClientes + " clientes)");
        } else {
            System.out.println("No se ingresaron datos válidos.");
        }

        scanner.close();
    }
}
