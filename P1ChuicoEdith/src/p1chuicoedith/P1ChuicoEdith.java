/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1chuicoedith;
import java.util.Scanner;
public class P1ChuicoEdith {  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer numero:");
    double numero1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo numero:");
    double numero2 = scanner.nextDouble();
    double suma = numero1 + numero2;
    System.out.println("La suma de" + numero1 + "y" + numero2 + "es igual a" + suma );
    }  
}
