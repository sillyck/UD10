package Classes;

public class MiExcepcion extends Exception{

	private int codExcepcion;

	public MiExcepcion(int codExcepcion) {
		super();
		this.codExcepcion = codExcepcion;
	}

	public MiExcepcion() {
		super();
	}
	
	public String codeError(int numError) {

		String mensaje = "";

		switch (numError) {

		case 1:
			mensaje = "Esto es un objeto Excepcion 1";
			break;

		case 2:
			mensaje = "Esto es un objeto Excepcion 2";
			break;

		case 3:
			mensaje = "Esto es un objeto Excepcion 3";
			break;

		}

		return mensaje;

	}

	
}
