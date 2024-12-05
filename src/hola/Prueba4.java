package hola;
import java.util.Scanner;
public class Prueba4 {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Indroduce una edad:");

int edad = scanner.nextInt(); 

while (edad>100 || edad<0) {
	System.out.println("No vale. Introduce un valor entre 0 y 100");
	edad = scanner.nextInt(); 
}

if (edad>=0 && edad<=12) {
	System.out.println("Es un niño");
}if (edad>12 && edad <=17){
	System.out.println("Es un adolescente");
}if (edad>17 && edad <=29){
	System.out.println("Es un joven");
}if (edad>29 && edad <=100){
	System.out.println("Es un adulto");
}

scanner.close();
}
}
