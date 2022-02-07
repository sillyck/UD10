/**
 * 
 * @author Miquel Angel Montero
 * 
 */
package Objetos;

public class Aleatorio {

	//Atributos
	private int valor;
	
	//Constructor
	public Aleatorio() {
		this.valor = generarAleatorio();
	}
	
	//Hacemos que el valor del numero sea aleatorio
	public int generarAleatorio() {
		
		int resultat = (int) (Math.random()*(500-1))+1;
		
		return resultat;
		
	}

	
	//Getters & Setters
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
