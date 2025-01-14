package hola;

import java.util.Scanner;
public class Prueba9 {
	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

	System.out.println("Ingresa el primer número");
	
	float numero1 = scanner.nextFloat();
	
	System.out.println("Ingresa el segundo número");
	
	float numero2 = scanner.nextFloat();
	
	System.out.println("Ingresa el operador");
	
	char operador = scanner.next().charAt(0);
	
	float resultado = 0;
	
	
if (operador!='+' && operador!='-' && operador!='/' && operador!='*') {
	System.out.println("El operador introducido no es válido. Ingrese el operador nuevamente:");	
	operador = scanner.next().charAt(0);
}
	
	
switch (operador) {

case '+' : resultado = numero1 + numero2 ;
break;
	
case '-' : resultado = numero1 - numero2;
break;

case '/' : resultado = numero1/numero2;
break;

case '*' : resultado = numero1 * numero2 ;
break;

}
	
	System.out.println("El resultado de " + numero1 + operador + numero2 + " es " + resultado );
	
scanner.close();
}
}
