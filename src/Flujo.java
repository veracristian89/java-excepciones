
public class Flujo {

	public static void main(String[] args) {
		System.out.println("inicio main");
		metodo1();
		System.out.println("fin main");
	}
	
	private static void metodo1() {
		System.out.println("inicion metodo1");
		try {
			metodo2();
		} catch(MiExcepcion me) {
			me.printStackTrace();
		}
		
		System.out.println("fin metodo1");
	}
	
	private static void metodo2() throws MiExcepcion {
		System.out.println("inicion metodo2");
		throw new MiExcepcion("Mi excepcion fue lanzada");
	}
}
