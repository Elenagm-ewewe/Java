package Rel3;

import java.util.Scanner;
public class Ejercicio03Rel3 {
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
System.out.println("Introduce un numero");
	int num = entrada.nextInt();
	
String esto = num + "";	
	
int cifras = esto.length();

System.out.println(cifras);

//cerramos el scanner____________________________
	entrada.close();
}
}
