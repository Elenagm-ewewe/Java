package Rel4;


import java.util.Scanner;
public class Caracteres2 {

	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una cadena de caracteres");
		String cadena = entrada.next();
		
		int minusculas = numerominusculas(cadena);
		int mayusculas = numeromayusculas(cadena);
		int numero = numerodenumeros(cadena);
		
		System.out.println("En la cadena "+ cadena + " hay " + minusculas + " letras minúsculas, " + mayusculas + " mayúsculas y " + numero+ " números");
		
		
		entrada.close();
	}
	
//__METODO PARA CONTAR LAS MINUSCULAS____________________________________
	
	public static int numerominusculas(String cadena) {
		int numerominusculas = 0;
		int numcar = cadena.length();
		
		     for (int i = 0 ; i <numcar ; i++) {
		    	 char p =cadena.charAt(i);
		    	 
		    	 if(Character.isLowerCase(p)) {
		    		 numerominusculas++;
		    	 }
		     }
	return numerominusculas;
	}
	
//__METODO PARA CONTAR LAS MAYUSCULAS____________________________________
	
	public static int numeromayusculas(String cadena) {
		int numeromayusculas = 0;
	
		for (int i=0 ; i< cadena.length(); i++) {
			char t = cadena.charAt(i);
			
			if (Character.isUpperCase(t)) {
				numeromayusculas++;
			}
		}
		
	return numeromayusculas;
	}
	
	public static int numerodenumeros(String cadena) {
		int numerodnumeros = 0;
		
		    for(int i = 0 ; i < cadena.length() ; i++) {
		    	char n = cadena.charAt(i);
		    	
		    	if (Character.isDigit(n)) {
		    		numerodnumeros++;
		    	}
		    	
		    }
		
		return numerodnumeros;
	}
}
