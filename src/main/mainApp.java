/**
 * 
 * @author Miquel Angel Montero
 * 
 */
package main;

import InterficieGrafica_Metodos.IntGrafica;
import Objetos.Aleatorio;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objeto aleatorio
		Aleatorio a = new Aleatorio();
		
		//Iniciamos la interficie grafica
		IntGrafica.interficie(a);
		
	}

}
