package hola;

//Importamos la clase scanner para poner introducir numeros por teclado
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		
//Definimos numero1 como entero
		int numero1 = scanner.nextInt();
		
//Comprobamos si el numero introducido es POSITIVO, en caso contrario se debe volver a introducir 
		while (numero1 < 0){
			System.out.println("Por favor, introduce un numero POSITIVO");
			numero1 = scanner.nextInt();
		}
			
		System.out.println("Introduce el segundo numero:");

		
		int numero2 = scanner.nextInt();
		
//De nuevo, comprobamos si el numero introducido es POSITIVO,
		while (numero1 < 0) {
			System.out.println("Por favor, introduce un numero POSITIVO");
			numero2 = scanner.nextInt();
		}	
//Cerramos el scanner porque ya no lo vamos a utilizar más
		scanner.close();

		
//Para saber cual numero es mayor de los 2 introducidos
	
		int numerom = 0;
		
		if (numero1 < numero2) {
			numerom = numero2;
		} else {
			numerom = numero1;
		}

		System.out.println("es numero mayor es " + numerom);	

		for (int i = 0; i <= numerom; i++) {

		    if (numero1%i == 0 && numero2%i == 0) {
		    	int divisor = i;
			    System.out.println("El " + numero1 + " y el " + numero2 + " son divisibles por " + divisor);
		    }
		}
		
		
}
}