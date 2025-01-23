package Rel5;

import java.util.Scanner;

public class Ejercicio07Arrays {
public static void main(String[]args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce el número N");
	int n = entrada.nextInt();
	
//-----------------------------------------------------------

	
	int [][] matriz = new int[n][10];
	
	
//-----------------------------------------------------------
	
			for (int i =0 ; i<n; i++) {
				
				for (int o = 0 ; o<10 ; o++) {
					
					matriz[i][o] = (i+1) * (o+1);
					
					System.out.print(matriz[i][o] + " ");
				}
				
				System.out.println();
			}
			
	entrada.close();
}
}
