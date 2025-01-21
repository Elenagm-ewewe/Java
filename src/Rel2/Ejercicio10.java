package Rel2;

import java.util.Scanner;
public class Ejercicio10 {

public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduce un numero entero:");
	int numero = scanner.nextInt();
	
	long fact = 1;

	
	for (int i = 1 ; i<=numero ; i++) {
		
		fact = fact * i;
	}
	
	System.out.println("El factorrial es " + fact);
	
	scanner.close();
	
}
}