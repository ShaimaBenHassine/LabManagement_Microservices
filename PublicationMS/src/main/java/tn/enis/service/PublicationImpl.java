package tn.enis.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.dao.PublicationRepository;
import tn.enis.entities.Publication;

@Service

public class PublicationImpl implements IPublicationService {
	@Autowired
	PublicationRepository publicationRepository;

	@Override
	public Publication addPublication(Publication pub) {
		return publicationRepository.save(pub);
	}

	@Override
	public void deletePublication(Long id) {
		if (publicationRepository.findById(id).isPresent())
			publicationRepository.deleteById(id);
	}

	@Override
	public Publication updatePublication(Publication pub) {
		return publicationRepository.saveAndFlush(pub);
	}

	@Override
	public Publication findPublication(Long id) {
		return publicationRepository.findById(id).get();
	}

	@Override
	public List<Publication> findAll() {
		return publicationRepository.findAll();
	}

	@Override
	public List<Publication> findByType(String type) {
		return publicationRepository.findByType(type);
	}

	@Override
	public Publication findByTitre(String titre) {
		return publicationRepository.findByTitre(titre);
	}

	@Override
	public Publication findByLien(String lien) {
		return publicationRepository.findByLien(lien);
	}

	@Override
	public List<Publication> findBydate(Date date) {
		return publicationRepository.findByDate(date);
	}

	@Override
	public Publication findBySourcePDF(String sourcePDF) {
		return publicationRepository.findBySourcePDF(sourcePDF);
	}

}
