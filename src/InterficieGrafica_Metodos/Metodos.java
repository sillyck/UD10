/**
 * 
 * @author Miquel Angel Montero
 * 
 */
package InterficieGrafica_Metodos;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import Objetos.Aleatorio;

public class Metodos {

	//Utilizamos un try catch para comprobar si el número es realmente un numero
	public static int comprobarNum(String numS) {
		
		try {
			int num = Integer.parseInt(numS);
			return num;
		}catch(NumberFormatException e){
			System.out.println("No se ha introducido un numero");
		}
		
		return 501;
		
	}
	
	//Comprobamos si el numero introducido es mayor menor o igual al aleatorio
	public static boolean mayorMenor(int numEsc, Aleatorio numAl, int cont) {
		
		boolean res = false;
		
		if(numEsc > numAl.getValor()) {
			
			JOptionPane.showMessageDialog(null, "El numero introducido es mayor que el numero aleatorio");
			
		}else if(numEsc < numAl.getValor()) {
			
			JOptionPane.showMessageDialog(null, "El numero introducido es menor que el numero aleatorio");
			
		}else {
			
			numAdivinado(cont);
			res = true;
			
		}
		
		return res;
		
	}
	
	public static void numAdivinado(int num) {
		
		JOptionPane.showMessageDialog(null, "Has adivinado el numero!!\nHas intentado adivinarlo "+num+" veces.");		
		
	}
	
}
