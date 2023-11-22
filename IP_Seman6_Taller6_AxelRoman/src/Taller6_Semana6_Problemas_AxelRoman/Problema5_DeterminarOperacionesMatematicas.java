/*
Ejercicio 5: Determinar el tipo de operación matemática.
 */
package Taller6_Semana6_Problemas_AxelRoman;
/**
 * @author Axel Stewart Roman Torres
 */
import java.util.Scanner;
public class Problema5_DeterminarOperacionesMatematicas {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int operacion;
        double num1, num2, result = 0;
        System.out.println("Hola usuario");
        System.out.println("Selecciona el tipo de operacion que deseas realizar");
        System.out.println("  [1] SUMA\n  [2] RESTA\n  [3] MULTIPLICACION\n  [4] DIVISION");
        operacion = tc.nextInt();
        System.out.println("Ingresa los numeros a operar");
        System.out.println("Ingresa el primer numero");
        num1 = tc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        num2 = tc.nextDouble();
        System.out.println("=============================");
        switch (operacion){
            case 1:
                System.out.println("SUMA");
                result = num1 + num2;
                break;
            case 2:
                System.out.println("RESTA");
                result = num1 - num2;
                break;
            case 3:
                System.out.println("MULTIPLICACION");
                result = num1 * num2;
                break;
            case 4:
                System.out.println("DIVISION");
                result = num1 / num2;
                break;
            default:
                System.out.println("Opcion no reconocida");
        }
        System.out.println("El resultado de la operacion es: " + result);
    }
}