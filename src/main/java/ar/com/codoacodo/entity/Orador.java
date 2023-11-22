package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {

	/*atributos que representan los campos de la tabla oradores en la db*/
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	//usado cuando quiera enviar un orador a la db
        //alt+shift+s
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}
	//cuando quiera traer un orador desde la db
	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}
	//anulo el constructor por defecto
	/*contructor*/
	//alt+shit+s
	
	//agregamos getters/setters
	//un setter es un metodo que permite modificar
	//el contenido de UN SOLO atributos
	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		}else {
			this.nombre = "N/D";
		}
	}
	public String getNombre() {
		return this.nombre;
	}
        
        //automaticamente creo los getters y setter con ctrl + shift + s
	
        
}
