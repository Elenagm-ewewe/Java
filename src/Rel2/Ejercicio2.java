package Rel2;

import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


System.out.println("Inserta un numero entero");

int num = scanner.nextInt();

for (int i=1 ; i < 11; i++) {
	
	int resultado = num * i ;
	System.out.println(num + "x" + i + "=" + resultado);
}

scanner.close();
}
}
