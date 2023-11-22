/*
Ejercicio 3: Costo de envío de paquetes.
 */
package Taller6_Semana6_Problemas_AxelRoman;
/**
 * @author Axel Stewart Roman Torres
 */
import java.util.Scanner;
public class Problema3_CostodeEnvioPaquetes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double pesoPaquete;
        String region;
        System.out.println("Hola usuario, a continuacion ingresa los datos de tu pedido");
        System.out.println("Ingresa tu region (local, nacional, ...)");
        region = tc.nextLine();
        System.out.println("Ingresa el peso del paquete en kg");
        pesoPaquete = tc.nextDouble();
        System.out.println("===============================");
        if ((pesoPaquete < 5) && (region.equals("local"))){
            System.out.println("El costo del envio es de $5");
        } else if (((pesoPaquete >= 5) && (pesoPaquete <=10)) && (region.equals("nacional"))){
            System.out.println("El costo del envio es de $10");
        } else {
            System.out.println("El costo del envio es de $15");
        }
    }
}