package clases;
import java.lang.Math;
public class Random {
	
	public void aleatiorio() {
		try {
			System.out.println("Generando numero random: ");
			int numero =(int) (Math.random() * 999);// Numero aleatorio
			if(numero % 2 == 0) {
				System.out.println(numero);
				throw new Exception("Numero par");
			}else {
				System.out.println(numero);
				throw new Exception("Numero impar");
			}
		}catch(Exception random) {
			System.out.println(random.getMessage());
		}
	}
	
	
}
