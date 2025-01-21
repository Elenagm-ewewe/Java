package Rel3;

import java.util.Scanner;
public class Ejercicio08Rel3 {
public static void main(String[]args) {
Scanner entrada = new Scanner(System.in);

System.out.println("Introduce el caracter que vas a utilizar");
char caracter = entrada.next().charAt(0);

System.out.println("Introduce ancho del rectángulo");
int ancho = entrada.nextInt();

System.out.println("Introduce alto del rectángulo");
int alto = entrada.nextInt();

//___________________________________________________________

for (int i = 0 ; i<alto ; i++) {
	
	System.out.print(caracter);
	
	for (int p = 1; p<ancho ; p++) {
		
		System.out.print(caracter);
	}
	
	System.out.print("\n");
}


entrada.close();
}
}

