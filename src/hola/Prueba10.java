package hola;

import java.util.Scanner;
public class Prueba10 {
public static void main(String[]args) {

Scanner scanner = new Scanner(System.in);
	
System.out.println("Qué tipo de tarta quieres? M- Manzana, F-Fresa o C-Chocolate");

char tipo = scanner.next().toUpperCase().charAt(0);

double precio = 0;

switch (tipo) {

case 'M': // Tarta de manzana
    precio = 12;
    break;
    
case 'F': // Tarta de fresa
    precio = 16;
    break;
    
case 'C': // Tarta de chocolate
    System.out.println("¿Qué tipo de chocolate deseas? (negro o blanco):");
    String tipoChocolate = scanner.nextLine().toLowerCase();
    
    if (tipoChocolate.equals("negro")) {
        precio = 14;
        
    } else if (tipoChocolate.equals("blanco")) {
        precio = 15;
    break;
    } 
    }
	
String saltoDeLinea = scanner.nextLine();

System.out.println("¿Añadimos nata?(Si o no) ");
String nata = scanner.nextLine();

if (nata.equals("Si")) {
	precio = precio + 2.5;
}


System.out.println("¿Ponemos tu nombre personalizado?(Si o no) ");
String nombre = scanner.nextLine();

if (nombre.equals("Si")) {
	precio = precio + 2.75;
}


System.out.println("El precio de la tarta es de " + precio + " euros");	

scanner.close();
}
}
