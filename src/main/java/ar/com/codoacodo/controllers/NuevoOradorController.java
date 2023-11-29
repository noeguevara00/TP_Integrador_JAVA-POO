package ar.com.codoacodo.controllers;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.repository.MySQLOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;

public class NuevoOradorController {

	public static void main(String[] args) {
		String nombre = "Pepita";
		String apellido = "González";
		String email = "pepgon@mail.com";
		String tema = "Python";
		
		//validación		if(nombre == null || apellido == null || email == null || tema == null) {
			//response json de error
		}
		
		OradorRepository repository = new MySQLOradorRepository();
		repository.save(new Orador(nombre, apellido, email, tema, LocalDate.now()));
		
		//respondo al frontend con un json ok
		System.out.println("ok");
	}
}
