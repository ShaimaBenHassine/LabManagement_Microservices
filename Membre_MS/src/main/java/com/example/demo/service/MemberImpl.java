package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

@Service
public class MemberImpl implements IMemberService {
	@Autowired
	MembreRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository enseignantRepository;

	@Override
	public Membre addMember(Membre m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMember(Long id) {
		if (memberRepository.findById(id).get() != null)
			memberRepository.deleteById(id);

	}

	@Override
	public Membre updateMember(Membre m) {

		return memberRepository.saveAndFlush(m);
	}

	@Override
	public Membre findMember(Long id) {
		Membre m = (Membre) memberRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Membre> findAll() {

		return memberRepository.findAll();
	}

	@Override
	public Membre findByCin(String cin) {
		return memberRepository.findByCin(cin);
	}

	@Override
	public Membre findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	@Override
	public List<Membre> findByNomStartingWith(String caractére) {
		return memberRepository.findByNomStartingWith(caractére);
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return memberRepository.findByDiplome(diplome);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		return memberRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return memberRepository.findByEtablissement(etablissement);
	}

	public Etudiant affecterEtudianttoEnseignant(Long idetd, Long idens) {
		Etudiant e1 = etudiantRepository.findById(idetd).get();
		EnseignantChercheur ens = enseignantRepository.findById(idens).get();
		e1.setEncadrant(ens);
		return memberRepository.save(e1);
	}

	@Override
	public List<Etudiant> findEtudiantsByEncadrant(Long idens) {
		EnseignantChercheur ens = enseignantRepository.findById(idens).get();
		return etudiantRepository.findByEncadrant(ens);

	}

}
