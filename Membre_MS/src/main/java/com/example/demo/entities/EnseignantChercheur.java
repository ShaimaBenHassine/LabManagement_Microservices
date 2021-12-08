package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@RequiredArgsConstructor
@DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre implements Serializable {

	private static final long serialVersionUID = 1L;
	private String grade;
	private String etablissement;
	
	/*
	public EnseignantChercheur(Long id, String cin, String nom, String prenom, String cv, Date dateNaissance,
			byte[] photos, String email, String password) {
		super(id, cin, nom, prenom, cv, dateNaissance, photos, email, password);
		// TODO Auto-generated constructor stub
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etablissement == null) ? 0 : etablissement.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnseignantChercheur other = (EnseignantChercheur) obj;
		if (etablissement == null) {
			if (other.etablissement != null)
				return false;
		} else if (!etablissement.equals(other.etablissement))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EnseignantChercheur [grade=" + grade + ", etablissement=" + etablissement + "]";
	}
	public EnseignantChercheur(String grade, String etablissement) {
		super();
		this.grade = grade;
		this.etablissement = etablissement;
	}
*/
	//@OneToMany(mappedBy ="encadrant")
	//@JsonIgnore
	
}
