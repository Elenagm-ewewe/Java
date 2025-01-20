package Rel2;

import java.util.Scanner;
public class Ejercicio4 {
public static void main(String[]args) {
	
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingresa un numero positivo");
	
	int num = scanner.nextInt();
	
if (num < 0) {
	System.out.println("El numero no es positivo, ingresa nuevamente");
	num = scanner.nextInt();
}

long suma = 0;

for (int i = 0 ; i < num+ 1; i++) {
	
	suma = suma+ i;
}

System.out.println("El resultado es " + suma);
	
scanner.close();
}
}