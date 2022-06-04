
public class Conexion {

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
}
