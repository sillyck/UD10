/**
 * @author Eloy
 */
package clases;
import javax.swing.JOptionPane;

public class Calculos {

	public void Operaciones() {
		double num = 0;
		double resultado = 0;
		double calculo = 0;
		String numString="";
		String op = JOptionPane.showInputDialog("Escribe que operacion quieres hacer:");
		//Hacemos un switch para coger que operacion queremos hacer
		switch (op) {
		case "+":
			String calculoString = JOptionPane.showInputDialog("Cuantos numeros calcularas: ");
			calculo = Double.parseDouble(calculoString);
			//Hacemos un for para recorres cuantos numeros queremos sumas, lo mismo hacemos con la division y la multiplicacion
			for (int i = 0; i < calculo; i++) {
				try {
					//Pedimos el numero que queremos calcular
					numString = JOptionPane.showInputDialog("Escribe un numero a calcular:");
					num = Double.parseDouble(numString);
					resultado += num;
				}catch(NumberFormatException nonumero) {//Si el campo esta vacio, indicara un error
					System.out.println("Te falta indicar un numero");
				}
			}
				if(numString != null) {//Si el campo esta lleno, mostrara el resultado
					JOptionPane.showMessageDialog(null, resultado);
				}

			break;
		case "-":
			calculoString = JOptionPane.showInputDialog("Cuantos numeros calcularas: ");
			calculo = Double.parseDouble(calculoString);
			for (int i = 0; i < calculo; i++) {
				try {
					numString = JOptionPane.showInputDialog("Escribe un numero a calcular:");
					num = Double.parseDouble(numString);
					resultado = num - resultado;
				}catch(NumberFormatException nonumero) {
					System.out.println("Te falta indicar un numero");
				}
			}
			if(numString != null) {
				JOptionPane.showMessageDialog(null, resultado);
			}
			break;
		case "*":
			calculoString = JOptionPane.showInputDialog("Cuantos numeros calcularas: ");
			calculo = Double.parseDouble(calculoString);
			for (int i = 0; i < calculo; i++) {
				try {
					numString = JOptionPane.showInputDialog("Escribe un numero a calcular:");
					num = Double.parseDouble(numString);
					resultado *= num;
				}catch(NumberFormatException nonumero) {
					System.out.println("Te falta indicar un numero");
				}
			}
			if(numString != null) {
				JOptionPane.showMessageDialog(null, resultado);
			}
			break;
		case "/":
			numString = JOptionPane.showInputDialog("Escribe el primer numero a calcular:");
			num = Double.parseDouble(numString);
			String numString2 = JOptionPane.showInputDialog("Escribe el segundo numero a calcular:");
			double num2 = Double.parseDouble(numString2);
				try {
					resultado = num/num2;
					if(numString != null && numString2 != null && num !=0 && num2!=0) {
						JOptionPane.showMessageDialog(null, resultado);
					}else if(num ==0 || num2==0){
						//Si uno de los dos campos son 0, lanzara una excepcion (ArithmeticException), no se podra dividir entre 0
						throw new ArithmeticException("No se puede dividir por 0");
					}
				}catch(ArithmeticException e) {
					System.out.println(e.getMessage());//Mostramos la excepcion de dividir entre 0
				}catch(NumberFormatException nonumero) {
					System.out.println("Te falta indicar un numero");
				}
			break;
		case "^2":
			calculoString = JOptionPane.showInputDialog("Escribe el numero a elevar por 2: ");
				try {
					calculo = Double.parseDouble(calculoString);
					resultado = Math.pow(calculo, 2);
				}catch(NumberFormatException nonumero) {
					System.out.println("Te falta indicar un numero");
				}
				if(calculoString != null) {
					JOptionPane.showMessageDialog(null, resultado);
				}
			break;
		case "^3":
			calculoString = JOptionPane.showInputDialog("Escribe el numero a elevar por 3: ");
				try {
					calculo = Double.parseDouble(calculoString);
					resultado = Math.pow(calculo, 3);
				}catch(NumberFormatException nonumero) {
					System.out.println("Te falta indicar un numero");
				}
				if(calculoString != null) {
					JOptionPane.showMessageDialog(null, resultado);
				}
			break;

		default:
			System.out.println("Operación invalida");
			break;
		}
	}
}
