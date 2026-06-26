package katas;

import java.util.Scanner;

public class Kata1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el total de la cuenta: ");
        double totalCuenta = sc.nextDouble();

        System.out.println("Ingresa el porcentaje de propina");
        double porcentajePropina = sc.nextDouble();

        double propina = totalCuenta * porcentajePropina / 100;
        double totalPagar = totalCuenta + propina;

        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);

        if(porcentajePropina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentajePropina > 5) {
            System.out.println("Propina muy baja");
        }

    }
}
