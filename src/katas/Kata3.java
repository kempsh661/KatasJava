package katas;

import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioProducto;
        double subtotal = 0.0;

        do {
            System.out.println("Ingrese el precio del producto: ");
            precioProducto = sc.nextDouble();
            subtotal += precioProducto;
        } while (precioProducto != 0.0);

        double iva = subtotal * 0.19;
        double total = subtotal + iva;
        double descuento = 0.0;

        if (total > 50000) {
            descuento = total * .10;
            total = total - descuento;
            System.out.println("Se aplica descuento de 10%");
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println(("Total: " + total));
    }
}
