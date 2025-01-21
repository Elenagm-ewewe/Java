package Rel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[]args)  {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> numeros = new ArrayList<>();

	
System.out.println("Introduce un numero positivo");
int numero = scanner.nextInt();
	
int suma= 0;
	
for (int i=1 ; i < numero ; i++) {
	
	if (numero%i==0) {
    suma = suma + i;
    numeros.add(i);
	}
}
	
if (suma==numero) {
	System.out.print("El número " + numero + " es un numero perfecto porque ");
	
	for (int num : numeros) {
		System.out.print(num+ "+");
	}
	
	System.out.print("="+ suma);
	
}else {
	System.out.print("El número " + numero + " NO es un numero perfecto porque ");
	
	for (int num : numeros) {
		System.out.print(num+ "+");
	}
	
	System.out.print("="+ suma);
}

	
scanner.close();
	
}
}