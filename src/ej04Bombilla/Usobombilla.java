package ej04Bombilla;

public class Usobombilla {
	
	public static void main(String[]args) {

	Bombilla b1 = new Bombilla();
	Bombilla b2 = new Bombilla();

	System.out.println("La bombilla 1 está: " + b1.estadobombilla());
	System.out.println("La bombilla 2 está: " + b2.estadobombilla());

		
		//Encendemos b1
	b1.encenderBombilla();
	System.out.println("La bombilla 1 está: " + b1.estadobombilla());
	System.out.println("La bombilla 2 está: " + b2.estadobombilla());
		
Bombilla.interruptorGeneral = true;

System.out.println("La bombilla 1 está: " + b1.estadobombilla());
System.out.println("La bombilla 2 está: " + b2.estadobombilla());
	}
}
