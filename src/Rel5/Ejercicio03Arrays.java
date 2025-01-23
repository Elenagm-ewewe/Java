package Rel5;

//Crea un programa que pregunte cuántos elementos tendremos en un array de enteros. 
//Posteriormente se preguntarán tantos números como haya indicado el usuario.
//Después, mostraremos por pantalla el mayor, el menor y la media

import java.util.Scanner;
public class Ejercicio03Arrays {
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("¿Cuántos elementos tendrá el array?");
	int elementos = entrada.nextInt();
	
	int[]vector=new int[elementos];
	int mayor=0;
	int menor=0;
	double suma = 0;
	
	       for (int i =0 ; i<elementos ; i++) {
	    	   System.out.println("Introduzca el número "+ (i+1));
	    	   vector[i]= entrada.nextInt();
	    	   
	    	   if(vector[i]>0) {
	    		   mayor = vector[i];
	    	   }
	    	   
	    	   if(vector[i]<0) {
	    		   menor = vector[i];
	    	   }
	    	   
	    	   suma= suma+vector[i];
	       }
	
	double media=suma/elementos;
	
	System.out.println("El mayor numero introducido es " + mayor);
	System.out.println("El menor numero introducido es " + menor);
	System.out.println("La media de los números introducidos es " + media);
	
	
	entrada.close();
}
}
