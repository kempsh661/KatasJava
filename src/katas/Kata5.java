package katas;

import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double totalPedido = 0;

        while (opcion != 6 ) {
            System.out.println("--- Menú de la cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500");
            System.out.println("3. Sandwich ($7.500");
            System.out.println("4. Jugo ($5.000");
            System.out.println("5. Té ($3.000");
            System.out.println("6. Salir");

            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    totalPedido += 4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                    break;
                case 2:
                    totalPedido += 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    break;
                case 3:
                    totalPedido += 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    break;
                case 4:
                    totalPedido += 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    break;
                case 5:
                    totalPedido += 3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                    break;
                case 6:
                    if (totalPedido == 0){
                        System.out.println("Saliendo del sistema.");
                    } else {
                        System.out.println("Gracias por la compra.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }
        System.out.println("Total pedido: "+ totalPedido);
    }
}
