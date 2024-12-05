package hola;

import java.util.Scanner;
public class Prueba3 {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce un número");
int numero = scanner.nextInt();

if (numero % 2 == 0 && numero % 3 == 0) {
	System.out.println("El número "+ numero + " es múltiplo de 2 y de 3");
} if (numero % 3 == 0 && numero % 2 != 0) {
	System.out.println("El número "+ numero + " es múltiplo de 3");
} if (numero % 2 == 0 && numero % 3 != 0){
	System.out.println("El número "+ numero + " es múltiplo de 2");
} if (numero % 2 != 0 && numero % 3 != 0){
	System.out.println("El número "+ numero + " NO es múltiplo ni de 2 ni de 3");
}
	
scanner.close();
}
}

