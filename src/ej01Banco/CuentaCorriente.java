package ej01Banco;

import java.util.Scanner;

public class CuentaCorriente {
	
	String titular;
	String DNI;
	double saldo;
	String banco;
	private Gestor gestor;
	
	public CuentaCorriente(String nombre, String DNI) {
		this.titular = nombre;
		this.DNI = DNI;
		this.saldo = 0;
		this.banco = "BBVA";
		this.gestor = null;
	}
	
	public void setBanco(String nuevobanco) {
		this.banco = nuevobanco;
	}
	
	public String getBanco() {
		return banco;
	}
	
	//Asignar gestor a la cuenta
	public void asignarGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	
	
	//Método para crear una cuenta corriente
	public static CuentaCorriente crearCuenta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre del titular: ");
		String titular = entrada.nextLine();
		System.out.println("Introduce el DNI: ");
		String DNI = entrada.next();
		
		System.out.println("Cuenta corriente creada con éxito");
		
		return new CuentaCorriente(titular, DNI);
	}
	
	//Método para mostrar la información de la cuenta
	public void mostrarInformacion() {
		System.out.println("--------------------------------------------");
		System.out.println("Nombre del titular: " + titular);
		System.out.println("DNI: " + DNI);
		System.out.println("Saldo: " + saldo);
		System.out.println("Entidad bancaria: " + banco);
		
		if (gestor!= null) {
		System.out.println("Gestor: " + gestor.nombre);
		System.out.println("Teléfono del gestor: " + gestor.telefono);
		}
		System.out.println("--------------------------------------------");
	}
	
	//Método para ingresar dinero
	public void ingresarDinero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuanto dinero vas a ingresar en tu cuenta (€)");
		double ingreso = entrada.nextDouble();
		this.saldo = saldo + ingreso;
		System.out.println("Operación realizada con éxito");
	}
	
		//Metodo para sacar dinero
		public void sacarDinero() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Cuanto dinero vas a retirar de tu cuenta(€)?");
			double sacar = entrada.nextDouble();
			
			if (sacar <= saldo) {
				this.saldo = saldo - sacar;
				System.out.println("Operación realizada con éxito");
			}else if(sacar>saldo) {
				System.out.println("No hay saldo suficiente");
			}else if (sacar ==0) {
				System.out.println("No puedes retirar 0 Euros");
			}
		}
}
