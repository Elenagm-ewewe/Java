package hola;

import java.util.Scanner;
public class Prueba5 {
public static void main(String[] arg) {
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce el primer número");
int numero1 = scanner.nextInt();
System.out.println("Introduce el segundo número");
int numero2 = scanner.nextInt();
System.out.println("Introduce el tercer número");
int numero3 = scanner.nextInt();
System.out.println("Introduce el cuarto número");
int numero4 = scanner.nextInt();

float media = numero1 + numero2 + numero3 + numero4;

media= media/4;

System.out.println("La media de los 3 números dados es " + media);

System.out.println("Los números superiores a la media son ");

scanner.close();	
}
}
