package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.service.IMemberService;

//@SpringBootApplication(exclude = { BatchAutoConfiguration.class})
@SpringBootApplication
@EnableDiscoveryClient
public class MembreMsApplication implements CommandLineRunner {
	@Autowired
	MembreRepository membreRepository;
	@Autowired
	IMemberService memberService;
	public static void main(String[] args) {
		SpringApplication.run(MembreMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Etudiant etd1 = new Etudiant();
		Etudiant etd2 = new Etudiant();
		EnseignantChercheur ens1 = new EnseignantChercheur();
		EnseignantChercheur ens2 = new EnseignantChercheur();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY-MM-dd");
		Date date1 = dateFormatter.parse("2010-05-01");
		Date date2 = dateFormatter.parse("2005-08-02");
		Date date3 = dateFormatter.parse("2006-07-07");
		Date date4 = dateFormatter.parse("2006-08-07");
		Date date5 = dateFormatter.parse("2020-08-07");
		Date date6 = dateFormatter.parse("2020-08-04");
		ens1.setNom("ali");
		ens1.setPrenom("ali");
		ens1.setEtablissement("enis");
		ens1.setEmail("ali@enis.tn");
		ens1.setCin("02154444");
		ens1.setDateNaissance(date3);
		ens1.setCv("cv Ali");
		ens1.setEtablissement("enis");
		ens1.setGrade("doctor");
		membreRepository.save(ens1);
		ens1.setNom("achref");
		ens1.setPrenom("tarifa");
		ens1.setEtablissement("enis");
		ens1.setEmail("achref@enis.tn");
		ens1.setCin("0275444");
		ens1.setDateNaissance(date4);
		ens1.setCv("cv achref");
		ens1.setEtablissement("enis");
		ens1.setGrade("doctor");
		membreRepository.save(ens2);
		etd1.setNom("farah");
		etd1.setPrenom("ben amor");
		etd1.setEmail("farah@enis.tn");
		etd1.setCin("0123456");
		etd1.setDateNaissance(date1);
		etd1.setDiplome("Info");
		etd1.setDateInscription(date5);
		//etd1.setEncadrant(ens1);
		etd1.setCv("cv farah");
		membreRepository.save(etd1);
		etd2.setNom("chaima");
		etd2.setPrenom("ben hassine");
		etd2.setEmail("chaima@enis.tn");
		etd2.setCin("1258755");
		etd2.setDateNaissance(date2);
		etd2.setCv("cv chaima");
		etd2.setDateInscription(date6);
		etd2.setDiplome("electrique");
		//etd2.setEncadrant(ens2);
		membreRepository.save(etd2);
		memberService.affecterEtudianttoEnseignant(3L,1L);
		
	}

}
