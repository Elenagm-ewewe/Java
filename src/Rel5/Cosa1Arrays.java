package Rel5;

import java.util.Scanner;
public class Cosa1Arrays {

	public static void main(String[]arg) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Cuántos números vas a introducir?");
		
		int posicion = entrada.nextInt();
		
		
		int [] vector = new int [posicion];
		
		      for (int i = 0 ; i < posicion ; i++) {
		    	  vector[i]= solicitarnumeros(i,entrada);
		      }
		
		
		 for (int x=posicion-1 ; x >= 0 ; x--) {
			 System.out.print(vector[x] + " ");
		 }

		 entrada.close();
	}
	
	
	
	//Método para solicitar el número de las posiciones
	
	public static int solicitarnumeros(int i, Scanner entrada) {

		System.out.println("Introduce el número en la posición " + (i+1));
		
		int numero = entrada.nextInt();
		

		
		return numero;
	}
	
	
}
