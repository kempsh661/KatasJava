import  java.util.Scanner;
public class Kata7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidad;
        double precio;

        double subtotal;
        double iva;
        double total;
        double totalCompra = 0;
        String continuar;
        do {
            double descuento = 0;
            System.out.println("Ingresa el precio del producto:");
            precio = scanner.nextDouble();
            while (precio <= 0) {
                System.out.println("Precio inválido. Ingrese un valor mayor a 0.");
                System.out.println("Ingresa el precio del producto:");
                precio = scanner.nextDouble();
            }
            System.out.println("Ingresa la cantidad del producto:");
            cantidad = scanner.nextInt();
            while (cantidad <= 0) {
                System.out.println("Cantidad inválida. Debe ingresar al menos una unidad.");
                System.out.println("Ingresa la cantidad del producto:");
                cantidad = scanner.nextInt();
            }
            subtotal = precio * cantidad;
            if (cantidad >= 1 && cantidad <= 2){
                descuento = 0;
            } else if (cantidad >= 3 && cantidad <= 5) {
                descuento = subtotal * 0.05;
            } else if (cantidad >= 6 && cantidad <= 10) {
                descuento = subtotal * 0.1;
            } else if (cantidad >= 11) {
                descuento = subtotal * 0.15;
            }
            total = subtotal - descuento;
            iva = total * 0.19;
            total = total + iva;

            System.out.println("Subtotal: "+ subtotal);
            System.out.println("Descuento : "+ descuento);
            System.out.println("Iva (19%): "+ iva);
            System.out.println("Total: "+ total);
            totalCompra += total;
            System.out.println("¿Agregar otro producto? (S/N):");
            continuar = scanner.next();
        }while (continuar.equalsIgnoreCase("S"));
        System.out.println("Total de la compra: "+ totalCompra);
    }
}
