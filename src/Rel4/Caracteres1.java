package Rel4;

//--Realizar un método que tenga como parámetros de entrada una cadena de caracteres y un
//--carácter y devuelva cuántas veces aparece ese carácter en la cadena. No debe distinguir entre
//--caracteres mayúsculas y minúsculas.

import java.util.Scanner;
public class Caracteres1 {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
//INTRODUCIMOS LOS DATOS POR EL USUARIOS, UNA CADENA Y UN CARACTER__________________________________
		
		System.out.println("Ingresa una cadena de caracteres");
		String cadena= entrada.next().toUpperCase();
		
		System.out.println("Ingresa un caracter");
		char caracter= entrada.next().charAt(0);
		
		
		
		
		int numerodecaracteres = numerocaracteres(cadena, caracter);
		
		System.out.println("El número de caracteres " + caracter + " en la cadena es de " + numerodecaracteres);
		
	entrada.close();
	}
	
//__________________________________________________________________________________________________
	//METODO PARA CONTAR LOS CARACTERES
	
	public static int numerocaracteres(String cadena, char carac) {
		  
		int numerocarac = cadena.length();	
		int veces =0;	
		
		carac = Character.toUpperCase(carac);

//_______________________________________________________________
		
		        for (int i = 0 ; i<numerocarac ; i++) {
		        
		        	      if (cadena.charAt(i)==carac) {
		        	    	  veces++;
		        	      }
		        }
		        
		return veces;
	}
}
