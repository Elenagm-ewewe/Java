package ej03Texto;

import java.util.Scanner;

public class textomain {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número máximo de caracteres");
		int caracteres = entrada.nextInt();
		
		System.out.println("Introduce una palabra");
		String cadena = entrada.next();
		
		Texto texto = new Texto(cadena,caracteres);
		
		System.out.println("Introduce un caracter para añadir");
		char esto = entrada.next().charAt(0);
		texto.mascaracter(esto);
		
		System.out.println(texto.cadena);
		
		
		System.out.println("Introduce una cadena para añadir");
		String aquello = entrada.next();
		texto.masstring(aquello);
		
		
		System.out.println("La cadena " + texto.cadena + " tiene " + texto.contarVocales(texto.cadena) + " vocales"); 
		System.out.println("La cadena " + texto.cadena + " se creó en " + texto.fechacreacion + " y se modificó por última vez el " + texto.fechamodificacion); 
		
		entrada.close();
	}
}
