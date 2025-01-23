package Rel5;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio08Arrays {
public static void main(String[]args) {

	Scanner entrada=new Scanner(System.in);
	Random aleatorio= new Random();
	
int x = entrada.nextInt();
int y = entrada.nextInt();

//----------------------------------------------------------------------

char [][] matriz1 = new char [x][y];
char [][] matriz2 = new char [x][y];

//----------------------------------------------------------------------

System.out.println("Matriz opriginal:");


//----------------------------------------------------------------------


for (int i= 0 ; i < matriz1.length ; i++) {
	
	for(int o = 0 ; o < matriz1[i].length ; o++) {
		
		//Asignamos caracteres aleatorios a la matriz original----------
		
		matriz1[i][o]= (char)('a' + aleatorio.nextInt(20));
		System.out.print(matriz1[i][o] + " ");
		
		//Asignamos los caracteres invertidos a la matriz copiada-------
		
		matriz2[i][o]= matriz1[x - i - 1][y - o - 1];
	}
	
	System.out.println();
}

//Asignamos los caracteres invertidos a la matriz copiada---------------

System.out.println();
System.out.println("Matriz 1 invertida con el for");

for ( int i = matriz1.length -1 ; i >= 0 ; i--) {
	
	for ( int o = matriz1[i].length -1; o >= 0 ; o--) {
		
		System.out.print(matriz1[i][o] + " ");
	}
	System.out.println();
}

//----------------------------------------------------------------------
System.out.println();
System.out.println("Matriz 2 ");

for(int e = 0 ; e<matriz2.length ; e++) {
	for (int l =0 ; l < matriz2[e].length ; l++) {
		
		System.out.print(matriz2[e][l] + " ");
	}
	System.out.println();
}

entrada.close();
}
}
