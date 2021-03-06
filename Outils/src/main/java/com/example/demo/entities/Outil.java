package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Outil implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	Date date;
	String source;
	
	public Outil() {
		super();
	}

	public Outil(Long id, Date date, String source) {
		super();
		this.id = id;
		this.date = date;
		this.source = source;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	
	
	
	
	
	
	
	
	
	

}
