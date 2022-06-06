
public class TestConexion {

	public static void main(String[] args) throws Exception {
		 // try con recurso (try whit resource)
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		/*
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} catch (IllegalStateException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("ejecutando finally");
			if (con != null) {
				con.cerrar();
			}			
		}*/
	}
}
