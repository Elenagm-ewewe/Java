package ej06Cajas;

enum Unidad{CM, M};

public class Caja {

	int ancho;
	int alto;
	int fondo;
	String etiqueta;
	public Unidad unidad;
	
	
	//Constructor
	public Caja(int ancho, int alto, int fondo, Unidad unidad) { 
		this.ancho=ancho;
		this.alto=alto;
		this.fondo= fondo;
		this.unidad=unidad;
		this.etiqueta=""; //Inicialmente la etiqueta está vacía
	}

	//Saber volumen
	public double getVolumen() {
		
	double volumen;
		
		if(unidad==Unidad.CM) {
			volumen = (ancho/100.0) * (alto/100.0) * (fondo/100.0);
		}else {
			volumen = ancho * alto * fondo;
		}
	return volumen;
	}
	
	//Modificar etiqueta
	
	public void setEtiqueta(String etiquetilla) {
		if(etiquetilla.length() <= 30) {
			this.etiqueta= etiquetilla;
		}else {
			System.out.println("La etiqueta supera los 30 caracteres");
		}
		
	}
	
	public String informacionCaja() {
		return "La caja tiene " + ancho + unidad + " de ancho, "+ alto + unidad + " de alto y " + fondo + unidad + " de profundidad. ";
	}
	
}
