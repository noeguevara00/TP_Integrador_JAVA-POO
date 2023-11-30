package ar.com.codoacodo.controllers;

import ar.com.codoacodo.repository.*;
import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.interfaces.IOradorRepository;

public class NuevoOradorController {

	public static void main(String[] args) {

		IOradorRepository repository = new MySQLOradorRepository();
		
		
		//respondo al frontend con un json ok
		System.out.println("ok");
		
		
		
		
		/*repository.delete(6L);*/
		/*Date fechaPrueba = Date.valueOf(LocalDate.now());
		
		LocalDate fechaConvertida = fechaPrueba.toLocalDate();
		
		System.out.println("Fecha convertida "+fechaConvertida);
	
		System.out.println("Fecha Prueba "+fechaPrueba.toLocalDate().atStartOfDay(ZoneId.systemDefault()));
		
		/*.getDate(6).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();*/
		
		
		//interface i = new ClaseQueImplementa()..
		
		
		//Trae un orador de la base de datos
		/*Orador orador = repository.getById(1L);
		
		System.out.println(orador);
		
		//Insertar un orador con el metodo save() de la interface
		
		Orador nuevoOrador = new Orador("Carlita", "Pancha", "carlitaPancha@mail.com", "Que es la pachata", LocalDate.now());
		
		System.out.println(nuevoOrador.toString());
		
		repository.save(nuevoOrador);
		
		//Se inserta otro orador con metodo save()
		
		/*Orador nuevoOrador2 = new Orador("Mickey", "Donald", "mickeydonald@mail.com", "Que es disney", LocalDate.now());
		
		System.out.println(nuevoOrador2.toString());
		
		repository.save(nuevoOrador2);*/
		
		//Se elimina registro de la DB
		
		
		//Se despliega lista de oradores
		System.out.println(repository.findAll().toString());
		
	}
}
