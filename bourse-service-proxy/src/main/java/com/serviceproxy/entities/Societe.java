package com.serviceproxy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;



public class Societe implements Serializable {

	private Long id;
	private String nomSociete;
	
	
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Societe(String nomSociete) {
		super();
		this.nomSociete = nomSociete;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	
	
	
	
}
