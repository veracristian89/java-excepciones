						//se implementa interfaz AutoCloseable para el try con recurso
public class Conexion implements AutoCloseable {

	public Conexion() {
		System.out.println("abriendo conexion");
	}
	public void leerDatos() {
		System.out.println("recibiendo datos");		
		throw new IllegalStateException();
	}
	public void cerrar() {
		System.out.println("cerrando conexion");		
	}
	@Override
	public void close() throws Exception {
		cerrar();
	}
}
