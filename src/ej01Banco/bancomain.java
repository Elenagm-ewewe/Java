package ej01Banco;

import java.util.Scanner;

public class bancomain {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		//Llamamos al metodo para crear una cuenta en la variable cuenta1
		CuentaCorriente cuenta1 = CuentaCorriente.crearCuenta();
		
		int opcion;
		
		do {
			
			System.out.println(" Operaciones:");
			System.out.println(" ...................................");
			System.out.println(" .     1. Mostrar información      .");
			System.out.println(" .     2. Ingresar dinero          .");
			System.out.println(" .     3. Sacar dinero             .");
			System.out.println(" .     4. Modificar banco          .");
			System.out.println(" .     5. Modificar gestor         .");
			System.out.println(" .     6. Salir                    .");
			System.out.println(" ...................................");
			
			opcion= entrada.nextInt();
			
				switch(opcion) {
				
					case 1:
						cuenta1.mostrarInformacion();
					break;
					
					case 2:
						cuenta1.ingresarDinero();
					break;
					
					case 3:
						cuenta1.sacarDinero();
					break;
					
					case 4:
						System.out.println("Introduce la nueva entidad bancaria:");
						String nuevobanco = entrada.next();
						cuenta1.setBanco(nuevobanco);
						System.out.println("Entidad bancaria cambiada con éxito a " + cuenta1.getBanco());
					break;
					
					case 5:
						entrada.nextLine();
						System.out.println("Introduce el nombre del nuevo gestor");
						String nombre = entrada.nextLine();
						System.out.println("Introduce el telefono del nuevo gestor");
						String telefono = entrada.next();
						Gestor gestornuevo = new Gestor(nombre,telefono);
						cuenta1.asignarGestor(gestornuevo);
						System.out.println("Operación realizada con éxito");
						
					break;
					
					case 6:
						
					break;
					
					default:
						System.out.println("Opción no válida");
					
				}
			
		}while(opcion!=6);
		
		System.out.println("Has salido del sistema");
		
	entrada.close();
	}
	
	
}
