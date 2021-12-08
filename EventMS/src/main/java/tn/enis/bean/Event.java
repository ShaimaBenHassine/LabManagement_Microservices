package tn.enis.bean;

import java.util.Date;
import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Event implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String titre;
	Date date;
	String lieu;
	public Event(String titre, Date date, String lieu) {
		super();
		this.titre = titre;
		this.date = date;
		this.lieu = lieu;
	}
	public Event() {
		super();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
