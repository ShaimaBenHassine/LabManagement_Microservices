package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

public interface IMemberService {
	public Membre addMember(Membre m);

	public void deleteMember(Long id);

	public Membre updateMember(Membre p);

	public Membre findMember(Long id);

	public List<Membre> findAll();

	// Filtrage par propriété
	public Membre findByCin(String cin);

	public Membre findByEmail(String email);

	// public List<Membre> findByNom(String nom);

	// recherche spécifique des étudiants
	public List<Etudiant> findByDiplome(String diplome);

	// recherche spécifique des enseignants
	public List<EnseignantChercheur> findByGrade(String grade);

	public List<EnseignantChercheur> findByEtablissement(String etablissement);

	public List<Membre> findByNomStartingWith(String caractére);

	public Etudiant affecterEtudianttoEnseignant(Long idetd, Long idens);
	// public Etudiant affecterEtudianttoEnseignant(Long idetd,Long idens);

	public List<Etudiant> findEtudiantsByEncadrant(Long idens);

}
