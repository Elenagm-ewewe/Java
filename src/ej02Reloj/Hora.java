package ej02Reloj;

public class Hora {
	
	int horas;
	int minutos;
	int segundos;
	
	public Hora(int horas, int minutos, int segundos) {
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
	}

	
	public String mostrarHora() {
		
		return horas + ":" + minutos + ":" + segundos;
	}
	

	
	   public void avanzarSegundo() {
	        segundos++;
	        if (segundos == 60) {
	            segundos = 0;
	            minutos++;
	        }
	        if (minutos == 60) {
	            minutos = 0;
	            horas++;
	        }
	        if (horas == 24) {
	            horas = 0;
	        }
	    }
	}
