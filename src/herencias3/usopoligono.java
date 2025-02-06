package herencias3;

import java.util.Scanner;

public class usopoligono {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qué polígono desea calcular?");
		System.out.println("   1. Triángulo");
		System.out.println("   2. Rectángulo");
		
		int opcion = entrada.nextInt();
		
		switch(opcion) {
		
		case 1: 
			System.out.println("Ingresa la base del triángulo: ");
			double base = entrada.nextDouble();
			System.out.println("Ingresa la altura del triángulo: ");
			double altura = entrada.nextDouble();
		
			Triangulo tr = new Triangulo(base,altura);
			
			System.out.println("El area del triangulo (rectángulo) es de  " + tr.Area());
		break;
		
		case 2: 
			System.out.println("Ingresa la base del rectángulo: ");
			base = entrada.nextDouble();
			System.out.println("Ingresa la altura del rectángulo: ");
			altura = entrada.nextDouble();
		
			Rectangulo rec = new Rectangulo(base,altura);
			
			System.out.println("El area del triangulo (rectángulo) es de  " + rec.Area());
			
		break;
		
		default:
			System.out.println("Opcion no válida");
		}
		
		
		
		entrada.close();
	}
}
