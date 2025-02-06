package herencias3;

public class Rectangulo extends Poligono {
	
	
	
	public Rectangulo(double base, double altura) {
		super(base, altura);
		
	}
	
	public double Area() {
		double area = base*altura;
		return area;
	}

	
}