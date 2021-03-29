package ar.com.xeven;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Se pide al usuario que ingrese la fecha de vencimiento de un producto.
    Si el producto está vencido, se le sugiere que lo tire.
    Si faltan 30 días o más para su vencimiento, se le sugiere que lo guarde.
    Si faltan menos de 30 días para su vencimiento, se le pide que lo use pronto porque va a tener que tirarlo.
	 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dia de vencimiento: ");
        int diaVencimiento = sc.nextInt();
        System.out.print("Ingrese el mes de vencimiento: ");
        int mesVencimiento = sc.nextInt();
        System.out.print("Ingrese el anio de vencimiento: ");
        int anioVencimiento = sc.nextInt();
        LocalDate fechaVencimiento = LocalDate.of(anioVencimiento,mesVencimiento,diaVencimiento);
        LocalDate fechaHoy = LocalDate.now(); //fecha de hoy

        int elDiaDeVencimiento = fechaVencimiento.getDayOfYear();
        int elDiaDeHoy = fechaHoy.getDayOfYear();



            if (elDiaDeVencimiento < elDiaDeHoy) {
                //esta vencido
                System.out.println("TIRE ESO!!");
            } else if (elDiaDeVencimiento >= elDiaDeHoy) {
                if (elDiaDeVencimiento >= elDiaDeHoy+30) {
                    //faltan 30 dias o mAS
                    System.out.println("Debe guardar el producto");
                } else {
                    //faltan menos de 30 dias
                    System.out.println("Se sugiere usar el producto");
                }
            }
        }

    }







