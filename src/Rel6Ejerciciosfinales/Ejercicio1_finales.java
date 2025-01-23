package Rel6Ejerciciosfinales;

//Realizar un programa que lea un número entero positivo y averigüe si es perfecto. 
//Un número es perfecto cuando es igual a la suma de sus divisores excepto él mismo.
//Diseñar el programa de forma que si algún dato es incorrecto vuelva a solicitarse.

import java.util.Scanner;

public class Ejercicio1_finales {

	public static void main(String[]args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int num = entrada.nextInt();
		
//------------------------------------------------------
//COMPROBAMOS SI EL NUMERO INTRODUCIDO (num) es positivo
		
		if(num<0) {
		//En caso de ser negativo, hacemos un bucle hasta que la variable num sea positiva.
			do {
				System.out.println("Por favor, introduce un número POSITIVO:");
				num = entrada.nextInt();
			}while(num<0);
		}
		
//-------------------------------------------------------
//Añadimos un contador ascendente hasta el numero dado (num), comprobamos si cada uno de ellos es un divisor del mismo, si lo es lo sumamos en la variable 'suma'
		
		int contador=1;
		int suma = 0;
		
		do {
			if (num%contador==0) {
				suma= suma+contador;
			}
			contador++;
		}while(contador<num);
		
//Si la suma de los divisores es igual al numero introducido, imprimimos que SI es perfecto, en caso contrario, imprimimos los contrario
		
		if (suma==num) {
			System.out.println("El número " + num + " SÍ es perfecto");
		}else if(suma!=num) {
			System.out.println("El número " + num + " NO es perfecto");
		}
		
		entrada.close();	
		
	}
}
