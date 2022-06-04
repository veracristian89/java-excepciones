							//extiende de la clase propia de llava para arrojar excepciones.
public class MiExcepcion extends RuntimeException {

	public MiExcepcion() {
		super();
	}
	
	public MiExcepcion(String message) {
		super(message);
	}
	
}
