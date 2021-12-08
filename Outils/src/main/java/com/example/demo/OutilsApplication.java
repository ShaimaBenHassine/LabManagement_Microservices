package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;
import com.example.demo.service.IOutilService;

@SpringBootApplication
@EnableDiscoveryClient
public class OutilsApplication implements CommandLineRunner{

	
	@Autowired
	IOutilService outilService;
	@Autowired
	OutilRepository outilRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OutilsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Date d = new Date();
		Date a = new Date("2021/04/12");
		Outil e = new Outil(1L, d, "laboratoire");
		outilRepository.save(e);
		Outil s = new Outil(2L, a, "fournisseur");
		outilRepository.save(s);
		Outil m= outilService.findOutilById(2L);
		m.setSource("Fournisseur jdid");
		outilService.updateOutil(m);
		
		
		
		
		
		
	}

}
