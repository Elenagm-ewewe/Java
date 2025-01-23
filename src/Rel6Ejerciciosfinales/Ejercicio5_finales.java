package Rel6Ejerciciosfinales;

//Realizar un programa que solicite diez números enteros y cuando se termine de introducir el último los muestre en el orden inverso al que se introdujeron.

import java.util.Scanner;

public class Ejercicio5_finales {
	public static void main(String[]args) {
		
	Scanner entrada = new Scanner(System.in);
	
	//Creamos un array con los numeros que vamos a introducir
	int [] numeros = new int [10];
	
		for (int i = 0 ; i<10 ; i++) {
			System.out.println("Introduce el número " + (i+1));
			numeros[i]= entrada.nextInt();
		}
	
		//Imprimimos el array creado de forma invertida
		
		System.out.println("Numeros invertidos:");
		
		for (int a = 10 -1 ; a>0 ; a--) {
			System.out.print(numeros[a]+ " ");
			
		}
	
	
	entrada.close();
}
}