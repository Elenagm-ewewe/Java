package Rel3;

import java.util.Scanner;
public class Ejercicio10Rel3 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);

	System.out.println("Introduce el caracter que vas a utilizar");
	char caracter = entrada.next().charAt(0);

	System.out.println("Introduce la base del triángulo (impar)");
	int base = entrada.nextInt();
	
//____________________________________________________________________

if (base%2==0) {
	do {
	System.out.println("Por favor, introduce un número IMPAR");
	base = entrada.nextInt();
	}while(base%2==0);
}
//____________________________________________________________________

int lineas = (base/2)+1;
int ncaracteres = 1;

//____________________________________________________________________

for (int i=1; i<lineas+1; i++) {
	
	for (int p=1; p<ncaracteres+1; p++) {
	
	System.out.print(caracter);
	
	}
	
	ncaracteres = ncaracteres +2;
	System.out.println();
}
	
	entrada.close();
}
}