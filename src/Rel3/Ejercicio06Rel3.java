package Rel3;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio06Rel3 {
public static void main (String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	ArrayList<Integer> notas = new ArrayList<>();
	Random random = new Random();
	
	System.out.println("Cuantos alumnos hay en la clase?");
	int nalumnos = entrada.nextInt();
	
	int nota;
	
	for (int i = 1; i<nalumnos +1 ; i++) {
		nota = random.nextInt(9+1);
		notas.add(nota);
	}
	
	int sus = 0;
	int aprv = 0;
	
	for (int i = 0; i<nalumnos ; i++) {
		System.out.print("Alumno " + (i +1)+  ": ");
		System.out.print(notas.get(i));
		
		if(notas.get(i) <5) {
			System.out.print(" SUSPENSO");
			sus++;
		}else {
			System.out.print(" APROBADO");
			aprv++;
		}
	
		System.out.print(" \n");
	}
	
	System.out.println("En esta evaluación ha habido " + aprv + " aprovados y " + sus + " suspensos");
	
	
	entrada.close();
}
}