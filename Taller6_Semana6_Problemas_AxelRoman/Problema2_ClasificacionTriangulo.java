/*
Ejercicio 2: Clasificación de un triángulo.
 */
package Taller6_Semana6_Problemas_AxelRoman;
/**
 * @author Axel Stewart Roman Torres
 */
import java.util.Scanner;
public class Problema2_ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double lado1, lado2, lado3, sumaDosLados1, sumaDosLados2, sumaDosLados3;
        System.out.println("Hola usuario, a continuacion ingrese el valor de los tres lados de tu triangulo");
        System.out.println("Ingresa el lado 1");
        lado1 = tc.nextDouble();
        System.out.println("Ingresa el lado 2");
        lado2 = tc.nextDouble();
        System.out.println("Ingresa el lado 3");
        lado3 = tc.nextDouble();
        sumaDosLados1 = lado1 + lado2;
        sumaDosLados2 = lado1 + lado3;
        sumaDosLados3 = lado2 + lado3;
        System.out.println("===============================");
        if ((sumaDosLados1 < lado3) || (sumaDosLados2 < lado2) || (sumaDosLados3 < lado1)){
            System.out.println("No es triangulo");
        } else if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("Su triangulo es equilatero");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            System.out.println("Su triangulo es isosceles");
        } else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
            System.out.println("Su triangulo es escaleno");
        }    
    }
}