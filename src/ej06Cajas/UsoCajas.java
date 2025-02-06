package ej06Cajas;

import java.util.Scanner;


public class UsoCajas {

	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);

		Unidad unidad1 = null;
		
		System.out.println("Introduce el ancho de la caja");
		int ancho = entrada.nextInt();
		System.out.println("Introduce el alto de la caja");
		int alto = entrada.nextInt();
		System.out.println("Introduce el fondo de la caja");
		int fondo = entrada.nextInt();
		System.out.println("Introduce el fondo de la caja");
		
		while(unidad1==null) {
			System.out.print("Introduce la unidad (CM o M): ");
            String tipoUnidad = entrada.next().toUpperCase();
            unidad1 = Unidad.valueOf(tipoUnidad);
			
		}
		
		Caja cajeta = new Caja(ancho, alto, fondo, unidad1);
		
		System.out.println(cajeta.informacionCaja());
		
		System.out.println("La caja tiene un volumen de " + cajeta.getVolumen() + " m3");
		
		
		entrada.close();
	}
}
