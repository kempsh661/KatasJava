package katas;

import java.util.Scanner;

public class kata8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine();

        int totalHoras = 0;
        int contadorMas40 = 0;
        int contadorMenos20 = 0;
        String nombresMas40 = "";
        String nombresMenos20 = "";


        for (int i = 1; i <= numEmpleados; i++) {
            System.out.println("\n-- Empleado " + i + " --");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();


            System.out.print("Horas trabajadas: ");
            int horas = scanner.nextInt();
            scanner.nextLine();


            totalHoras = totalHoras + horas;


            if (horas > 40) {
                contadorMas40++;
                nombresMas40 = nombresMas40 + nombre + ", ";
            }


            if (horas < 20) {
                contadorMenos20++;  // Aumentar el contador
                nombresMenos20 = nombresMenos20 + nombre + ", ";
            }
        }

        double promedio = (double) totalHoras / numEmpleados;

        int sueldoPorHora = 12000;
        int sueldoTotal = totalHoras * sueldoPorHora;

        System.out.println("\n*** Reporte Turnos ***");
        System.out.println("Total de horas trabajadas: " + totalHoras + " horas");
        System.out.println("Promedio de horas por empleado: " + promedio + " horas");

        System.out.print("Empleados con más de 40 horas: " + contadorMas40);
        if (contadorMas40 > 0) {

            nombresMas40 = nombresMas40.substring(0, nombresMas40.length() - 2);
            System.out.print(" (" + nombresMas40 + ")");
        }
        System.out.println();

        System.out.print("Empleados con menos de 20 horas: " + contadorMenos20);
        if (contadorMenos20 > 0) {

            nombresMenos20 = nombresMenos20.substring(0, nombresMenos20.length() - 2);
            System.out.print(" (" + nombresMenos20 + ")");
        }
        System.out.println();

        System.out.println("Sueldo total a pagar: $" + sueldoTotal);

        scanner.close();
    }
}