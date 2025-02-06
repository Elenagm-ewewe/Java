package ej03Texto;

import java.time.LocalDateTime;

public class Texto {

	String cadena;
	int caracteres;
	LocalDateTime fechacreacion;
	LocalDateTime fechamodificacion;
	
	
	public Texto(String cadena,int caracteres) {
		
		this.cadena = cadena;
		this.caracteres = caracteres;
		this.fechacreacion = LocalDateTime.now();
		
	}
	
	//Metodo de comprobacion de la cadena
	public void crearcadena(String cadena) {
		if (cadena.length() > caracteres) {
			System.out.println("La cadena supera los caracteres máximos");
		}else{
			this.cadena=cadena;
		}
	}
	
	public void mascaracter(char caracter) {
		String cadena1 = caracter + cadena + caracter;
		crearcadena(cadena1);
		this.fechamodificacion=LocalDateTime.now();
	}
	
	public void masstring(String cadenilla) {
		String cadena2 = cadenilla + cadena + cadenilla;
		crearcadena(cadena2);
		this.fechamodificacion=LocalDateTime.now();
	}
	
	
	public int contarVocales(String cadena) {
		int numerovocales = 0;
		
		//Pasamos la cadena a minuscula
		cadena.toLowerCase();
		
		for (int i = 0 ; i< cadena.length(); i++)
		
			if("aeiou1234567890".indexOf(cadena.charAt(i)) != -1) {
				
				numerovocales ++;
			}
		
			
		return numerovocales;
	}
	
}
