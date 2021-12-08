package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;
	
	/*
	 * public Etudiant(Long id, String cin, String nom, String prenom, String cv, Date dateNaissance, byte[] photos,
			String email, String password) {
		super(id, cin, nom, prenom, cv, dateNaissance, photos, email, password);
	}
	 * public Etudiant(Long id, String cin, String nom, String prenom, String cv, Date dateNaissance, byte[] photos,
			String email, String password, Date dateInscription, String diplome, EnseignantChercheur encadrant) {
		super(id, cin, nom, prenom, cv, dateNaissance, photos, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}

	@Override
	public String toString() {
		return "Etudiant [dateInscription=" + dateInscription + ", diplome=" + diplome + ", encadrant=" + encadrant
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dateInscription == null) ? 0 : dateInscription.hashCode());
		result = prime * result + ((diplome == null) ? 0 : diplome.hashCode());
		result = prime * result + ((encadrant == null) ? 0 : encadrant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (dateInscription == null) {
			if (other.dateInscription != null)
				return false;
		} else if (!dateInscription.equals(other.dateInscription))
			return false;
		if (diplome == null) {
			if (other.diplome != null)
				return false;
		} else if (!diplome.equals(other.diplome))
			return false;
		if (encadrant == null) {
			if (other.encadrant != null)
				return false;
		} else if (!encadrant.equals(other.encadrant))
			return false;
		return true;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(EnseignantChercheur encadrant) {
		this.encadrant = encadrant;
	}*/

	

}
