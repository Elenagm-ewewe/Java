package hola;

import java.util.Scanner;
public class Prueba8 {
	public static void main(String[] args) {
Scanner scanner= new Scanner (System.in);
		
	System.out.println("Introduce la primera hora");
	System.out.println("Horas:");

int hora1 = scanner.nextInt();

if (hora1 >23) {
	System.out.println("Hora no válida, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	hora1 = scanner.nextInt();
}

System.out.println("Minutos:");

int min1 = scanner.nextInt();

if (min1 > 59) {
	System.out.println("Minutos no válidos, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	min1 = scanner.nextInt();
}

int seg1 = scanner.nextInt();

if (seg1 > 59) {
	System.out.println("Minutos no válidos, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	seg1 = scanner.nextInt();
}

System.out.println("La hora ingresada es " + hora1 + ":" + min1 + ":" + seg1);

System.out.println("Introduce la segunda hora");
System.out.println("Horas:");

int hora2 = scanner.nextInt();

if (hora2 >23) {
	System.out.println("Hora no válida, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	hora2 = scanner.nextInt();
}

System.out.println("Minutos:");

int min2 = scanner.nextInt();

if (min2 > 59) {
	System.out.println("Minutos no válidos, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	min2 = scanner.nextInt();
}

int seg2 = scanner.nextInt();

if (seg2 > 59) {
	System.out.println("Minutos no válidos, ingresa una hora entre las 00:00:00 hasta las 23:59:59");
	seg2 = scanner.nextInt();
}

System.out.println("La hora ingresada es " + hora2 + ":" + min2 + ":" + seg2);


if (hora1>hora2) {
	System.out.println("La hora 1 es mayor");
} else if (hora1<hora2) {
	System.out.println("La hora 2 es mayor");
}

if (hora1 == hora2) {
	if (min1>min2) {
		System.out.println("La hora 1 es mayor");
	}else if (min1<min2){
		System.out.println("La hora 2 es mayor");
	}
}
	

if (hora1 == hora2 && min1==min2) {
	if (seg1>seg2) {
		System.out.println("La hora 1 es mayor");
	}else if (seg1<seg2){
		System.out.println("La hora 2 es mayor");
}
}
scanner.close();

}
}
