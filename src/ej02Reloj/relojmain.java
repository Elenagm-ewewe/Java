package ej02Reloj;

import java.util.Scanner;

public class relojmain {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Introduce las horas");
	int horas = entrada.nextInt();
	
			if (horas < 0) {
				do {
					System.out.println("Las horas no pueden ser negativas. Introduzca nuevamente:");
					horas = entrada.nextInt();
				}while (horas < 0);
			}
	
	System.out.println("Introduce los minutos");
	int minutos = entrada.nextInt();
	
			if (minutos < 0 || minutos >= 60) {
				do {
					System.out.println("Los minutos no pueden ser negativos ni mayores a 59. Introduzca nuevamente:");
					minutos = entrada.nextInt();
				}while (minutos > 0 && minutos >= 60);
			}
	
	System.out.println("Introduce los segundos");
	int segundos = entrada.nextInt();
	
			if (segundos < 0 || segundos >= 60) {
				do {
					System.out.println("Los segundos no pueden ser negativos ni mayores a 59. Introduzca nuevamente:");
					segundos = entrada.nextInt();
				}while (segundos > 0 && segundos >= 60);
			}
	
	Hora hora = new Hora(horas,minutos,segundos);
	System.out.println("La hora introducida es " + hora.mostrarHora());
	
		System.out.println("Introduce los segundos");
		int segundosextra = entrada.nextInt();
		
		//--------------------------------------------------------
	
		for (int i = 0; i < segundosextra; i++) {
	        hora.avanzarSegundo();
	        System.out.println("Siguiente hora: " + hora.mostrarHora());
	        
	        try {
	            Thread.sleep(1000); // Espera 1 segundo
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
entrada.close();
}
}