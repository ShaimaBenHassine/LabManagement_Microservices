package tn.enis.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Publication implements Serializable {

	private static final long serialVersionUID = 1L;
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String type;
	private String titre;
	private String lien;
	private Date date;
	private String sourcePDF;
	

	public Publication() {
		super();
	}

	// @ManyToOne
	// private Membre membre;
	public Publication(Long id, String type, String titre, String lien, Date date, String sourcePDF) {
		super();
		Id = id;
		this.type = type;
		this.titre = titre;
		this.lien = lien;
		this.date = date;
		this.sourcePDF = sourcePDF;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSourcePDF() {
		return sourcePDF;
	}

	public void setSourcePDF(String sourcePDF) {
		this.sourcePDF = sourcePDF;
	}

}
