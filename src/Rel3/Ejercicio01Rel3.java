package Rel3;

import java.util.Scanner;
public class Ejercicio01Rel3 {
	
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Introduzca el primer número");
	int numero1 = scanner.nextInt();
	
	System.out.println("Introduzca el segundo número");
	int numero2 = scanner.nextInt();
	
	System.out.println("Introduzca el tercer número");
	int numero3 = scanner.nextInt();
	
	if (numero1 > numero2) {
		int temp = numero1;
		numero1 =numero2;
		numero2 = temp;

	}
		
	if (numero1 > numero3){
		int temp =numero1;
		numero1= numero3;
		numero3=temp;
		
	}
		
	if(numero2>numero3) {
		int temp = numero2;
		numero2 = numero3;
		numero3 = temp;
	}
	
	
	System.out.println(numero1 + " " + numero2 + " " + numero3);
	
scanner.close();
}
}