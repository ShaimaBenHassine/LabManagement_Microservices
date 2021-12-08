package tn.enis;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tn.enis.dao.PublicationRepository;
import tn.enis.entities.Publication;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicationMsApplication implements CommandLineRunner {
	@Autowired
	PublicationRepository publicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(PublicationMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormatter.parse("2021-09-06");
		Publication pub =new Publication(1L,"Article de recherche" , "Original Research", null, date1, null);
		publicationRepository.save(pub);
		
		
	}

}
