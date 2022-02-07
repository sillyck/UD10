/**
 * 
 * @author Miquel Angel Montero
 * 
 */
package InterficieGrafica_Metodos;


import javax.swing.JOptionPane;

import Objetos.Aleatorio;

public class IntGrafica {

	public static void interficie(Aleatorio a) {
		
		int numero = 0, cont = 0;
		boolean comp = true;
		
		//Bucle de la interficie
		do {
			String numeroS = JOptionPane.showInputDialog("Intenta adivinar el número (0 para salir)");
			numero = Metodos.comprobarNum(numeroS);//Comprobamos que el número es realmente un número
			
			
			//Miramos si el numero es igual mayor o menor al aleatorio
			if((numero != 501) && (numero != 0) && (Metodos.mayorMenor(numero, a, cont))) {
				comp = false;
			}
			
			cont++;//Aumentamos el numero de intentos
			
		}while((comp) && (numero != 0));//Salimos de bucle quando el la variable comp sea false
		
	}
	
}
