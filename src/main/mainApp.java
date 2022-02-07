package main;

import javax.swing.JOptionPane;

import Objetos.Password;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, lon = 0;
		
		//Try catch para evitar errores al no introducir un n�mero
		try {
			
			String numS = JOptionPane.showInputDialog("Introduce la capacidad de la array");
			num = Integer.parseInt(numS);
			
			String lonS = JOptionPane.showInputDialog("Introduce la longitud de las contrase�as");
			lon = Integer.parseInt(lonS);
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
		}
		
		//Creaci�n de arrays con la capacidad indicada
		Password[] aP = new Password[num];
		boolean[] aB = new boolean[num];
		
		//Bucle de rellenado y muestra de arrays
		for (int i = 0; i < aP.length; i++) {
			aP[i] = new Password(lon);
			aB[i] = aP[i].esFuerte(aP[i].getContrase�a());
			
			System.out.println(aP[i].getContrase�a() +" "+ aB[i]);
			
		}
		
	}

}
