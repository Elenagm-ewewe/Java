package hola;

import java.util.Scanner;

public class Prueba2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduce el primer número");
	int numero1 = scanner.nextInt();
	
	System.out.println("Introduce el segundo número");
	int numero2 = scanner.nextInt();
	
	if (numero1 < numero2) {
	System.out.println("El número " + numero1 + " es menor que el " + numero2);
	} else if (numero1 == numero2) {
	System.out.println("El número " + numero1 + " es igual que el " + numero2);
	}else{
		System.out.println("El número " + numero1 + " es mayor que el " + numero2);
scanner.close();
		
	}
		
	}
}