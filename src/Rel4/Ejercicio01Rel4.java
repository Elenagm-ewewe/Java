package Rel4;

import java.util.Scanner;
public class Ejercicio01Rel4 {
	
//________________________________________________________________
	
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int num1=9;
	int num2=6;
	
	int resultado = suma(num1, num2);
	
	System.out.println(resultado);
	
	
	entrada.close();
}	

//________________________________________________________________

	public static int suma(int cant1, int cant2) {
		return cant1 + cant2;	
	}
//________________________________________________________________
}
