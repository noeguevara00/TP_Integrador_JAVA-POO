package ar.com.codoacodo;

public class MainAuto {

	public static void main(String[] args) {

			// crear un auto
			Auto clio = new Auto("renault",
					"clio",
					"azul",
					2020,
					150f);
			
			//clio es un objeto de la clase Auto
			clio.encender();
			clio.acelerar();
			clio.acelerar();
			clio.acelerar();
			clio.acelerar();
		

	}

}
