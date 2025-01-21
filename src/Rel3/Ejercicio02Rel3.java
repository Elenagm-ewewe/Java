package Rel3;

import java.util.Scanner;
public class Ejercicio02Rel3 {

public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Introduce el número de la base");
	int base = entrada.nextInt();
	
	if (base < 0) {
		
		System.out.println("No válido. Introduce el número de la base");
		base = entrada.nextInt();
	}
		
		
	System.out.println("Introduce el número del exponente");
	int exp = entrada.nextInt();
	
if (exp < 0) {
		
		System.out.println("No válido. Introduce el número de la base");
		exp = entrada.nextInt();
	}
	

int resultado = base;

for (int i=1; i<exp ; i++) {
	
	resultado = resultado * base;
}

System.out.println("El resultado de " + base + " elevado a " + exp + " es igual a " + resultado);


entrada.close();
	
}
}
