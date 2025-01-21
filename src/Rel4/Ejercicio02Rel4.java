package Rel4;

import java.util.Scanner;
public class Ejercicio02Rel4 {

public static void main(String[]args) {
	Scanner entrada1 = new Scanner(System.in);
	
System.out.println("Introduce un número");

int numero = entrada1.nextInt();

for (int i =0 ; i<=numero; i++) {
	int resultado= factorial(i);
	System.out.println(i + "!" + "=" + resultado);
}
	
	

entrada1.close();
}

//_METODO PARA CALCULAR EL FACTORIAL_______________________________________________________

public static int factorial(int num) {
	int resultado=1;
	
	for(int q = 1; q <= num; q++) {
	     resultado = resultado * q;     
	}
	
	return resultado;
	
}


}