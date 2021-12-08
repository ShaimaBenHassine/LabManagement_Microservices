package tn.enis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.enis.entities.Publication;
import tn.enis.service.IPublicationService;

@RestController
public class PublicationRestController {
	@Autowired
	IPublicationService publicationService;
	@RequestMapping(value = "/publications", method = RequestMethod.GET)
	public List<Publication> findPublication() {
		return publicationService.findAll();
	}

	@GetMapping(value = "/publication/{id}")
	public Publication findPublicationById(@PathVariable Long id) {
		return publicationService.findPublication(id);
	}

	@GetMapping(value = "/publication/search/type")
	public Publication findOnePublicationByTitre(@RequestParam String titre) {
		return publicationService.findByTitre(titre);
	}

	@GetMapping(value = "/publication/search/lien")
	public Publication findOnePublicationByLien(@RequestParam String lien) {
		return publicationService.findByLien(lien);
	}
	@GetMapping(value = "/publication/search/SourcePDF")
	public Publication findOnePublicationBySourcePDF(@RequestParam String sourcePDF) {
		return publicationService.findBySourcePDF(sourcePDF);
	}

	@PostMapping(value = "/publications/publication")
	public Publication addPublication(@RequestBody Publication pub) {
		return publicationService.addPublication(pub);
	}

	/*@PostMapping(value = "/membres/etudiant")
	public Membre addMembre(@RequestBody Etudiant e) {
		return memberService.addMember(e);
	}*/

	@DeleteMapping(value = "/publications/{id}")
	public void deletePublication(@PathVariable Long id) {
		publicationService.deletePublication(id);
	}
	@PutMapping(value="/publications/publication/{id}")
	public Publication updatePublication(@PathVariable Long id, @RequestBody Publication pub) {
		pub.setId(id);
		return publicationService.updatePublication(pub);
	}

	
}
