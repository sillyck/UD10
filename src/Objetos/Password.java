package Objetos;

public class Password {

	//Atributos
	private int longitud;
	private String contraseña;
	
	//Constructores
	public Password() {
		this.longitud = 8;
		this.contraseña=generarPassword(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}
	
	//Metodo para generar contraseña
	public String generarPassword(int lon) {
		
		String caracters = "0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String cont = "";
		
		for (int i = 0; i<lon; i++) {
			//Se escoje un caracter aleatorio de el String caracters y se concatena a los caracteres anteriores.
			cont = cont + (caracters.charAt((int) (Math.random() * caracters.length())));
			
		}
		
		return cont;
		
	}
	
	//Metodo para comprobar si una contraseña es fuerte o no
	public boolean esFuerte(String cont) {
		
		boolean res = false;
		int num = 0, min = 0, may = 0;
		String minS = "abcdefghijklmnopqrstuvwxyz";
		String mayS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//Estos for detectan y cuentatn los numeros, mayusculas y minusculas de una contraseña
		for (int i = 0; i<cont.length(); i++) {			
			for (int j = 0; j<10; j++) {				
				try {					
					char ch = cont.charAt(i);
					int compNum = Integer.parseInt(String.valueOf(ch));
					num++;					
				}catch(NumberFormatException e){}
			}			
		}
		
		for (int i = 0; i<cont.length(); i++) {
			if((cont.charAt(i) < 91) && (cont.charAt(i) > 64)) {
				may++;
			}
		}
		
		for (int i = 0; i<cont.length(); i++) {
			if((cont.charAt(i) < 123) && (cont.charAt(i) > 96)) {
				min++;
			}
		}
		
		//Este if comprueba si la contraseña cumple con las caracteristicas de una contraseña fuerte
		if((may > 2) && (min > 1) && (num > 5)) {
			res = true;
		}
		
		return res;
		
	}
	
	//Getters & Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
}
