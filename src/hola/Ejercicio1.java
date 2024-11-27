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

		
//Para falicitar (mi comprension del ejercicio en realidad) la redaccion del codigo, asignaré al valor a el numero major, y al b el numero menor de los obtenidos
		int a , b;
		
		if (numero1 < numero2) {
			a = numero2;
			b = numero1;
		} else {
			a = numero1;
			b = numero2;
		}
		
//Creo la variable rest para guardar valores y poder operar adecuadamente, el valor de a es el del MCD de los dos numeros dados
		
		while (b != 0) {
			int rest = a % b;
			a = b ;
			b = rest ;
		}

//Imprimimos resultados
		
		if (a != 1) {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " no son primos entre sí, ya que ambos contienen el " + a + " como divisor común");
		} else {
			System.out.println("Los numeros " + numero1 + " y " + numero2 + " si son primos entre sí");

		}

		
}
}