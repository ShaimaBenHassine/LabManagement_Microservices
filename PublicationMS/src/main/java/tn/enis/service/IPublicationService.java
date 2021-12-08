package tn.enis.service;

import java.util.Date;
import java.util.List;

import tn.enis.entities.Publication;

public interface IPublicationService {
	// Crud sur les membres

	public Publication addPublication(Publication pub);

	public void deletePublication(Long id);

	public Publication updatePublication(Publication pub);

	public Publication findPublication(Long id);

	public List<Publication> findAll();

	// Filtrage par propriété

	public List<Publication> findByType(String type);

	public Publication findByTitre(String titre);

	public Publication findByLien(String lien);

	public List<Publication> findBydate(Date date);

	public Publication findBySourcePDF(String sourcePDF);

}
