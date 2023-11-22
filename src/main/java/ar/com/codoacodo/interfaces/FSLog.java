package ar.com.codoacodo.interfaces;

public class FSLog implements ILog {

	@Override
		//implementar el metodo log
		//polimorfismo: sobreescritura 
		public void log() {
			System.out.println("Grabando en c:/bla");
	}

}
