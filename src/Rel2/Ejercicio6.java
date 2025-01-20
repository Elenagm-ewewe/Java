package Rel2;

import java.util.Scanner;
public class Ejercicio6 {
public static void main(String[]args) {
Scanner scanner = new Scanner(System.in);
	
System.out.println("Ingresa el Numero A");
int numA = scanner.nextInt();

System.out.println("Ingresa el Numero B");
int numB = scanner.nextInt();
	
long resultado = 0 ;
long kk =0;
	
for (int i = 1 ; i < numB + 1 ; i++) {
	
    kk = resultado;
	resultado = numA + resultado;
	
	System.out.println(kk + "+" + numA + "=" + resultado);
}

scanner.close();
}
}
