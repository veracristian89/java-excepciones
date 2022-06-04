import javax.sound.midi.MidiUnavailableException;

public class Flujo {

	public static void main(String[] args) {
		System.out.println("inicio main");
		try {
			metodo1();
				// atrapa todas las excepciones que extienden de exception.
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin main");
	}
	
	private static void metodo1() throws MiExcepcion {
		System.out.println("inicion metodo1");
			metodo2();
		System.out.println("fin metodo1");
	}
	
	private static void metodo2() throws MiExcepcion {
		System.out.println("inicion metodo2");
		int a = 50/0;
		Cuenta c = null;
		c.deposita();
		throw new MiExcepcion("Mi excepcion fue lanzada");
	}
}
