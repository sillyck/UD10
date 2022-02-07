package Main;

import Classes.MiExcepcion;

public class excepcionsMain {

	public static void main(String[] args) {
		
		int numError = 2;
		
		try {
			
			if(numError==1) {
				throw new MiExcepcion(numError);
				
			}else if(numError==2) {
				throw new MiExcepcion(numError);
				
			}else if(numError==3) {
				throw new MiExcepcion(numError);
				
			}
			
		}catch (MiExcepcion Ex) {
			
			System.out.println(Ex.codeError(numError));
			
		}
		
	}

}
