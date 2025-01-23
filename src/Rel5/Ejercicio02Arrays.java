package Rel5;

//Crea un programa que detecte cuántos números negativos hay en un array de enteros

import java.util.Random;
import java.util.Scanner;
public class Ejercicio02Arrays {
	public static void main(String[]args) {

	Scanner entrada = new Scanner(System.in);
	Random aleatorio= new Random();
	
	System.out.println("¿Cuántos numeros tendrá el array?");
	int posiciones= entrada.nextInt();
	
	int []nuevoarray= new int [posiciones];
	
	
	int negativo=0;
	
	for (int i =0 ; i<posiciones ; i++) {
		nuevoarray[i]= aleatorio.nextInt();
		
		System.out.print(nuevoarray[i] + " ");
		
		if (nuevoarray[i]<0) {
			negativo++;
		}
		
	}
	
	int positivo = posiciones - negativo;
	
	
	System.out.println("En el array hay "+ negativo +" números negativos y " + positivo + " números positivos");
	
	entrada.close();
}
}
