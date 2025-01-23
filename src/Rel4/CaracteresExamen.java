package Rel4;

import java.util.Scanner;
public class CaracteresExamen {
public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce una cadena de caracteres");
	String cadena = entrada.next();
	
	
	for (int i = cadena.length() -1 ; i>=0 ; i--) {
		char q = cadena.charAt(i);
		System.out.print(q);
	}
	
	
	entrada.close();
}
}
