package katas;

import java.util.Scanner;

public class kata2 {
    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //Se piden datos de bebidas y tempreraturas
        System.out.print("Ingresa el nombre de la bebida: ");
        String nombreBebida = scanner.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = scanner.nextDouble();

        // Clasificion de la bebida evaluando los rangos de temperatura
        String clasificacion;

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30 && temperatura <= 60) {
            clasificacion = "Templada";
        } else {
            clasificacion = "Fría";
        }

        System.out.println(nombreBebida + ": " + clasificacion);

        // Se cierra el scanner al terminar
        scanner.close();
    }
}