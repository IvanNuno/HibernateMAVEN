package com.hibernatemaven.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPaciente")
	private int idPaciente;
	
	@Column(name="nombrePaciente")
	private String nombrePaciente;
	
	@Column(name="apellidoPaciente")
	private String apellidoPaciente;
	
	@Column(name="numeroCuarto")
	private int numeroCuarto;
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getApellidoPaciente() {
		return apellidoPaciente;
	}
	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}
	public int getNumeroCuarto() {
		return numeroCuarto;
	}
	public void setNumeroCuarto(int numeroCuarto) {
		this.numeroCuarto = numeroCuarto;
	}

}
