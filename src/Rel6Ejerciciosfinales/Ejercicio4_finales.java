package Rel6Ejerciciosfinales;

// Programa que usa un método que tiene como parámetros de entrada una cadena de caracteres y un carácter.
// Devuelve cuántas veces aparece ese carácter en la cadena.
// No debe distinguir entre caracteres mayúsculas y minúsculas.

import java.util.Scanner;

public class Ejercicio4_finales {
	public static void main(String[]args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres:");
		String cadena = entrada.next();
		
		System.out.println("Introduce un caracter:");
		char caracter = entrada.next().charAt(0);
		
		int n = calcularrepeticiones(cadena,caracter);
		
		System.out.println("El carácter " + caracter + " se repite " + n + " veces");
		
		entrada.close();
	}
	
//------------------------------------------------------------------------------------------
//Método para contar las repeticiones del caracter en la cadena-----------------------------
	
	public static int calcularrepeticiones(String cad, char c) {
		
		int contador = 0;
				
				cad = cad.toLowerCase();
				c = Character.toLowerCase(c);
				
//------------------------------------------------------------------------------------------
		
		for (int i =0 ; i < cad.length() ; i++) {
			
			if (cad.charAt(i) == c) {
				contador++;
			}
		}
		
		
		return contador;
	}
}
