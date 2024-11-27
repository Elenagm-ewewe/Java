package hola;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
//Realizar un programa que lea un número entero por teclado e informe de si el número es par o impar (el cero se considera par). 

System.out.println("Introduce un numero entero");
int num = scanner.nextInt();

scanner.close();

if (num % 2 <= 0) {
	System.out.println("Es par");
}else {
System.out.println("Es impar");

}
}
}
