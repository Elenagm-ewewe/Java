package Rel5;

import java.util.Scanner;

public class Ejercicio05Arrays {
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Cadena:");
	String cadena = entrada.next();
	
	System.out.println("Valor:");
	char valor = entrada.next().charAt(0);
	
//----------------------------------------------------------------------------------
	
	boolean sisale = false;
	int c =0;
	
//----------------------------------------------------------------------------------
	
	for (int i = 0 ; i<cadena.length();i++) {

		char elementos = cadena.charAt(i);
		
		if (elementos == valor) {
			sisale = true;
			c++;
		}
	}
	
//----------------------------------------------------------------------------------
	
		if(sisale==true) {
		System.out.println("El carácter " + valor + " aparece " + c + " veces");
		
	    }else if(sisale==false) {
	    System.out.println("Ese caracter no aparece");
      	}
	
//----------------------------------------------------------------------------------
	
	
	entrada.close();
}
}



