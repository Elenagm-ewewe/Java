package Rel2;


import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[]args)  {
	Scanner scanner = new Scanner(System.in);

	
System.out.println("Introduce un numero positivo");
int numero = scanner.nextInt();
	
int suma= 0;
	
for (int i=1 ; i < numero ; i++) {
	
	if (numero%i==0) {
    System.out.print(i + " ");
    suma = suma + i;
    
	}
}
	
if (suma==numero) {
	System.out.println("El número " + numero + " es un numero perfecto");
}else {
	System.out.println("El número " + numero + " NO es un numero perfecto");
}

	
scanner.close();
	
}
}