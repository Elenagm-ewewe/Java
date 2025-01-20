package Rel2;

import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	
int i = 0;
int num;


do {
	System.out.println("Escribe numero:");
	num = scanner.nextInt();
	
	i++;
} while (num > 0);
	
i= i-1;

System.out.println("Has escrito " + i + " numeros positivos");	
	
	
scanner.close();
}
}