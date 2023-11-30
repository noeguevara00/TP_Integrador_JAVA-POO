package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.time.ZoneId;

import java.sql.Date;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	public static void main(String[] args) {
		
		
		/*Date fechaPrueba = Date.valueOf(LocalDate.now());
		
		LocalDate fechaConvertida = fechaPrueba.toLocalDate();
		
		System.out.println("Fecha convertida "+fechaConvertida);
	
		System.out.println("Fecha Prueba "+fechaPrueba.toLocalDate().atStartOfDay(ZoneId.systemDefault()));
		
		/*.getDate(6).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();*/
		
		
		//interface i = new ClaseQueImplementa()..
		
		OradorRepository repository = new MySQLOradorRepository();
		
		//Trae un orador de la base de datos
		Orador orador = repository.getById(1L);
		
		System.out.println(orador);
		
		//Insertar un orador con el metodo save() de la interface
		
		Orador nuevoOrador = new Orador("Carlita", "Pancha", "carlitaPancha@mail.com", "Que es la pachata", LocalDate.now());
		
		System.out.println(nuevoOrador.toString());
		
		repository.save(nuevoOrador);
		
		//Se elimina regitro de la DB
		
		
		
		
		
		
		
		
		

	}

}
