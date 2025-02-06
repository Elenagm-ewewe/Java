package ej01Banco;

public class Gestor {

	String nombre;
	static String telefono;
	double importemaximo;
	
	public Gestor(String nombre, String telefono) {
		this.nombre= nombre;
		this.telefono= telefono;
		this.importemaximo = 1000;
		
	}
	
	public void setimporteMaximo(double importe) {
		this.importemaximo= importe;
	}
	
	public double getImportemaximo() {
		
		return importemaximo;
	}
	
}
