package ej06Cajas;

public class CajaCarton extends Caja{

	double superficie;
	double volumen;
	
	public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
		super(ancho, alto, fondo, unidad);
		this.superficie = (2 * (ancho*alto)) + (2 * (alto*fondo)) + (2 * (fondo * ancho));
	}
	
	
	public double getVolumen() {
			volumen = ancho * alto * fondo;
	return volumen;
	
	}
	}
