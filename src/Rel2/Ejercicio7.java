package Rel2;

import java.util.Scanner;
public class Ejercicio7 {
public static void main(String[]args) {
	
Scanner scanner = new Scanner(System.in);
	

System.out.println("¿Cuántos números vas a introducir?");	

double cant = scanner.nextDouble();
long num =0;
long sum = 0;

if (cant<0 || cant==0 || cant%1!=0) {
do {
	System.out.println("Por favor, introduce un numero entero POSITIVO");
	cant = scanner.nextDouble();
}while (cant<=0 || cant%1!=0);
}




	for (int i=1; i<cant + 1; i++ ) {
		System.out.println("Numero " + i);
		num = scanner.nextLong();
		sum = num + sum;
	}
		
	double media = sum/cant;

	System.out.println("La media de los numeros introducidos es " + media);

	scanner.close();
}
}
