package ej04Bombilla;

public class Bombilla {

	boolean interruptor;
	public static boolean interruptorGeneral = false;
	
	
	public Bombilla() {
		this.interruptor = false;
	}
	
	
	public void encenderBombilla() {
		this.interruptor = true;
	}
	
	public void apagarBombilla() {
		this.interruptor = false;
	}
	
	
	public String estadobombilla() {
		
		if (interruptor && interruptorGeneral) {
			return "Encendido";
		}else {
			return "Apagado";
		}
	}
}
