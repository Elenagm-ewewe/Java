package Rel2;

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	
for (int i=0 ; i < 10; i++) {
	
	System.out.println("Introduce un número");
	long numero = scanner.nextLong();
		
	if (numero%2 <= 0) {
		System.out.println("Es par");
	}else {
		System.out.println("Es impar");
	}

}	
		
			
scanner.close();
		
}	
}
