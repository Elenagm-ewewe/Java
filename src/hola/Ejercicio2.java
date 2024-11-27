package hola;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

//Introducimos el numero
	
	System.out.println("Introduce un número");
	int n = scanner.nextInt();
	scanner.close();
	System.out.println("Sucesión:");
	
//Voy a almacenar la sucesión en 1 vector que tendrá una longitud del numero dado
	int [] fibo = new int[n+1];
	
	fibo[0] = 0;
	fibo[1] = 1;
	
//Primero recorremos el vector para asignarle los valores, exceptuando los 2 primeros, a los que les he dado ya el valor manualmente.
//He obviado el primer numero de la serie, que seria el 0, por eso al numero dado le sumo 1
	
	for (int i = 2; i < n+1; i++) {
		fibo[i] = fibo[i-1] + fibo[i-2];
	}

//Volvemos a recorrer el vector para imprimir el resultado.
	for (int i = 1; i < n+1; i++) {
		System.out.println(fibo[i]);
	}
	
}
}
