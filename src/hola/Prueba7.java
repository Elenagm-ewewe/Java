package hola;

import java.util.Scanner; 
public class Prueba7 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Ingresa tu estado civil (S-Soltero, C-Casado, V-Viudo y D-Divorciado)");
	char estacivil = scanner.next().toUpperCase().charAt(0);
	
	System.out.println("Ingresa tu edad");
	int edad = scanner.nextInt();
	
	scanner.close();
	
if (estacivil =='S' || estacivil =='D' && edad<35 ) {	
System.out.println("Se aplica un porcentaje de retención del 12%");	

} else if (edad > 50) {
System.out.println("Se aplica un porcentaje de retención del 8.5%");

} else if (estacivil=='V' || estacivil=='C' && edad<35){
System.out.println("Se aplica un porcentaje de retención del 11.3%");

} else {
	System.out.println("Se aplica un porcentaje de retención del 10.5%");
}


}
}
