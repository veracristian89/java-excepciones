
public class TestConexion {

	public static void main(String[] args) {
		Conexion con = new Conexion();
		try {
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("Recibiendo exception");
			e.printStackTrace();
		} finally {
			System.out.println("ejecutando finally");
			con.cerrar();
		}
	}
}
