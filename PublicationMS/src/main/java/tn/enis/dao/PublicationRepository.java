package tn.enis.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.entities.Publication;


public interface PublicationRepository extends JpaRepository<Publication, Long>{
	List<Publication> findByType(String type);
	Publication findByTitre(String titre);
	Publication findByLien(String lien);
	List<Publication> findByTypeOrderByDateDesc(String type);
	List<Publication> findByDate(Date date);
	Publication findBySourcePDF(String sourcePDF);

	

}
