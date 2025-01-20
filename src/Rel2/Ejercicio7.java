package Rel2;

import java.util.Scanner;
public class Ejercicio7 {
public static void main(String[]args) {
	
Scanner scanner = new Scanner(System.in);
	

System.out.println("¿Cuántos números vas a introducir?");	

int cant = scanner.nextInt();
long num =0;
long sum = 0;

for (int i=1; i<cant + 1; i++ ) {
	System.out.println("Numero" + i);
	num = scanner.nextLong();
	sum = num + sum;
}
	
float media = sum/cant;

System.out.println("La media de los numeros introducidos es " + media);

scanner.close();

}
}
