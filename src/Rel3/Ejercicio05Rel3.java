package Rel3;

import java.util.Scanner;
public class Ejercicio05Rel3 {
public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
	
	String contraseña = "1357";
	int i =1;
	
	System.out.println("¿Cual es la contraseña?");
	String intento = entrada.next();
	
	do{
		if (!intento.equals(contraseña)) {
		
		System.out.println("CONTRASEÑA INCORRECTA. Te quedan " + (5-i) + " intentos");
		intento = entrada.next();
		}
	i++;
		
	}while (i<5 && intento != contraseña);
	
	if (intento.equals(contraseña)) {
	System.out.println("La caja fuerte se ha abierto satisfactoriamente");
	}
	
	entrada.close();
}
}
