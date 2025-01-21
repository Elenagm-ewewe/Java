package Rel3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04Rel3 {
public static void main (String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	Random random = new Random();
	
	int numerosecreto = random.nextInt(9+1);
	

	
	System.out.println("¿Qué numero es? Ingresa un número del 1 al 10");
	int num= entrada.nextInt();
	int i= 1;
	

	do {
		
		if (num<=0 || num>10) {
			System.out.println("Número no válido. Ingresa un número del 1 al 10");
			num= entrada.nextInt();
			
		}else if (num>numerosecreto){
			
			System.out.println("Fallo! El numero correcto es MENOR. Inténtalo de nuevo");
			num= entrada.nextInt();
			i++;
			
		} else if (num<numerosecreto) {
			
			System.out.println("Fallo! El numero correcto es MAYOR. Inténtalo de nuevo");
			num= entrada.nextInt();
			i++;
		}
		
		
		
	} while (num!=numerosecreto && i<5 );
	
	
	if (num==numerosecreto) {
		System.out.println("CORRECTO!! El numero correcto es " + numerosecreto);
		
	}else if (i==5) {
		System.out.println("QUÉ PENA!! Se acabaron los intentos. El numero secreto era " + numerosecreto);

		
	}
	
	
	
	
entrada.close();
	
}
}