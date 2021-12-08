package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
	Membre findByCin(String cin);

	List<Membre> findByNomStartingWith(String caractere);

	Membre findByEmail(String email);

	List<Membre> findByNom(String nom);

	List<Etudiant> findByDiplome(String diplome);

	List<EnseignantChercheur> findByGrade(String grade);

	List<EnseignantChercheur> findByEtablissement(String etablissement);

}
