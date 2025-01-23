package Rel5;

import java.util.Random;
import java.util.Scanner;
public class Ejercicio01Arrays {
public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	Random aleatorio= new Random();
	
	System.out.println("¿Cuántos numeros tendrá el array?");
	int posiciones= entrada.nextInt();
	
	int[] enteros = new int[posiciones];
	int suma=0;
	
	for(int i=0; i<posiciones ; i++) {
		enteros[i] = aleatorio.nextInt(100);
		suma= suma+enteros[i];
		System.out.print(enteros[i] + " ");
	}
	
	System.out.println("El resultado de la suma es "+suma);
	
	entrada.close();
}
}
