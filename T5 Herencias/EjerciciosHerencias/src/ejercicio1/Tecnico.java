package ejercicio1;

public class Tecnico extends Operario{
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Operario -> Tecnico ";	
		}
}
