package katas;  // ✅ IMPORTANTE: Debe estar en el paquete katas

import java.util.Scanner;

public class kata4 {    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Validador Horarios Cafeteria *****");

        System.out.println("Lunes = 1");
        System.out.println("Martes = 1");
        System.out.println("Miercoles = 1");
        System.out.println("Jueves = 1");
        System.out.println("Viernes = 1");
        System.out.println("Sabado = 1");
        System.out.println("Domingo = 1");
        System.out.println();

        System.out.println("Ingrese un dia (1-7)");

        int dia = scanner.nextInt();
        System.out.println("Ingrese una hora de (0-23)");

        int hora = scanner.nextInt();

        String diaSemana = "";
        String horaDia = "";
        boolean abierto = false;

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                horaDia = "6:00 AM - 8:00 PM";
                if (hora >= 6 && hora < 20) {
                    abierto = true;
                }
                break;
            case 2:
                diaSemana = "Martes";
                horaDia = "6:00 AM - 8:00 PM";
                if (hora >= 6 && hora < 20) {
                    abierto = true;
                }
                break;
            case 3:
                diaSemana = "Miércoles";
                horaDia = "6:00 AM - 8:00 PM";
                if (hora >= 6 && hora < 20) {
                    abierto = true;
                }
                break;
            case 4:
                diaSemana = "Jueves";
                horaDia = "6:00 AM - 8:00 PM";
                if (hora >= 6 && hora < 20) {
                    abierto = true;
                }
                break;
            case 5:
                diaSemana = "Viernes";
                horaDia = "6:00 AM - 8:00 PM";
                if (hora >= 6 && hora < 20) {
                    abierto = true;
                }
                break;
            case 6:
                diaSemana = "Sábado";
                horaDia = "7:00 AM - 2:00 PM";
                if (hora >= 7 && hora < 14) {
                    abierto = true;
                }
                break;
            case 7:
                diaSemana = "Domingo";
                horaDia = "Cerrado";
                abierto = false;
                break;
            default:
                diaSemana = "Día inválido";
                horaDia = "";
                abierto = false;
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Día: " + diaSemana);
        System.out.println("Hora: " + hora + ":00");

        if (abierto) {
            System.out.println("✅ La cafetería está ABIERTA");
            System.out.println("Horario de " + diaSemana + ": " + horaDia);
        } else {
            System.out.println("❌ La cafetería está CERRADA");
            if (dia == 7) {
                System.out.println("Los domingos la cafetería está cerrada");
            } else if (dia >= 1 && dia <= 6) {
                System.out.println("Horario de " + diaSemana + ": " + horaDia);
            } else {
                System.out.println("Día no válido");
            }
        }

        scanner.close();
    }
}