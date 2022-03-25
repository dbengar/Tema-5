package Ejercicio2;

public abstract class Poligono {
	private int numLados;
	
	public Poligono() {
		
	}
	
	public Poligono (int numLados) {
		this.numLados=numLados;
		
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	@Override
	public String toString() {
		return "Poligono lados= " + numLados;
	}
	
	
}
