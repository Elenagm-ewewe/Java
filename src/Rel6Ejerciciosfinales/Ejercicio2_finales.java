package Rel6Ejerciciosfinales;

//Realizar un programa que lea un número estrictamente positivo N y muestre la suma de los N primeros números.
//Diseña el programa de forma que si N es incorrecto vuelva a solicitarse. 
//Ejemplo: Introduce un número positivo: 4 La suma de los 4 primeros números es: 10

import java.util.Scanner;

public class Ejercicio2_finales {
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		do {
			if(n<0) {
				System.out.println("Por favor, introduce un número POSITIVO");
				n = entrada.nextInt();

			}
		}while(n<0);
		
		
		
int contador = 1;
int suma = 0;
        
//----------------------------------------------------------------------

        do {
        	suma= suma+contador;
        	contador++;
        	
        }while (contador<=n);
		
//----------------------------------------------------------------------
		
 System.out.println("La suma de los " + n + " primeros números es " + suma);
		
		entrada.close();
		
		
	}

}
