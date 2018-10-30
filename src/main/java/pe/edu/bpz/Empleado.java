package pe.edu.bpz.model.entity;

import java.io.Serializable;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpleado;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private  String apellido;
	
	@NotNull
	private Long codigo;
	
	@NotNull
	private Long celular;
	
	public Empleado(@NotNull Long idEmpleado, @NotNull String nombre, @NotNull String apellido, @NotNull Long codigo,
			@NotNull Long celular) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.celular = celular;
	}
	
	public Empleado crear(@NotNull Long idEmpleado, @NotNull String nombre, @NotNull String apellido, @NotNull Long codigo,
			@NotNull Long celular) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
		this.celular = celular;
		return new Empleado(idEmpleado,nombre,apellido,codigo,celular);
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	


	
	
	
}
