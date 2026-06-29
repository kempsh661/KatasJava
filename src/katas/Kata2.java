package katas;

import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresé el nombre de la bebida: ");
        String nombreBebida = sc.nextLine();

        System.out.println("Ingrese la temperatura: ");
        double temperaturaBebida = sc.nextDouble();

        if (temperaturaBebida > 60) {
            System.out.println(nombreBebida + ": " + "Caliente");
        } else if (temperaturaBebida > 30 && temperaturaBebida < 60) {
            System.out.println(nombreBebida + ": " + "Templada");
        } else {
            System.out.println(nombreBebida + ": " + "Fría");
        }
    }
}