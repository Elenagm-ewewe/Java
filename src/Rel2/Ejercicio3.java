package Rel2;

import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[]args) {
	
Scanner scanner = new Scanner(System.in) ;

System.out.println("¿Cuántos numeros vas a introducir?");

int numdnum = scanner.nextInt();

if (numdnum == 0) {
	System.out.println("No puedes introducir 0 números, Ingresa nuevamente");
	numdnum = scanner.nextInt();
}

for (int i=1 ; i < numdnum + 1 ; i++) {
	System.out.println("Introduce el numero " + i);
	int num = scanner.nextInt();
	
	if(num%2==0) {
	    System.out.println("Es par");
	}else {
		System.out.println("Es impar");
	}
}

scanner.close();

}
}
