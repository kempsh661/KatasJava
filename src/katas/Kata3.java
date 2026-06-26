package katas;

import  java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Kata3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double subtotal = 0;
        double iva;
        double total;
        double descuento = 0;
        double precio;

        do {
            System.out.println("Ingresa el precio del producto (0 para terminar):");
            precio = scanner.nextDouble();
            if (precio !=0){
                subtotal += precio;
            }
        }while (precio != 0);

        iva = subtotal *0.19;
        total = subtotal + iva;

        if (total > 50000){
            descuento = total * 0.10;

        }
        total = total - descuento;
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("Iva: "+ iva);
        System.out.println("Descuento: "+ descuento);
        System.out.println("Total: "+ total);

} }