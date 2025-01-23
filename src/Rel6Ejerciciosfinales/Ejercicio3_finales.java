package Rel6Ejerciciosfinales;

//Realizar un programa que solicite una cantidad de números que van a introducirse por teclado.
//Después, para cada uno de ellos que indique si el número es par o impar. Si la cantidad de números introducida es 0 o negativa volverá a solicitarse el dato.

import java.util.Scanner;

public class Ejercicio3_finales {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos numeros vas a introducir?");
		int n = entrada.nextInt();
		
		
	int contador=1;
		
		do {
			System.out.print("Introduce el número " + contador + ":");
			
			int numero= entrada.nextInt();
			
			
			     if (numero==0){
			    	 System.out.println("No válido, introduce nuevamente");
			    	 numero= entrada.nextInt();
			    	 
			    	 contador=contador-1;
			    	 
			     }else if(numero%2==0) {
				        System.out.println("El número " + numero + " es PAR");
			     }else if(numero%2!=0){
						System.out.println("El número " + numero + " es IMPAR");

			     }
			
			     System.out.println();
			     
			contador++;
		}while(contador<=n);
		
		System.out.println("Has llegado al limite de los números a introducir");
		
		entrada.close();
	}
}
