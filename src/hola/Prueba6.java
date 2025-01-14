package hola;
import java.util.Scanner;
public class Prueba6 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

	//Realizar un programa que solicite un carácter por teclado e informe por pantalla si el carácter es una vocal o no lo es. 
	// Si es una vocal mostrará el mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc. 
	
System.out.println("Ingresa un carácter");

char caracter = scanner.next().toLowerCase().charAt(0);
scanner.close();

switch (caracter) {
case 'a' :
System.out.println("Es la primeva vocal (A)");
break;

case 'e' :
System.out.println("Es la segunda vocal (E)");
break;

case 'i' :
System.out.println("Es la tercera vocal (I)");
break;

case 'o' :
System.out.println("Es la cuarta vocal (O)");
break;

case 'u' :
System.out.println("Es la quinta vocal (U)");
break;

default:
System.out.println("no es jeje");
break;
}
}
}
