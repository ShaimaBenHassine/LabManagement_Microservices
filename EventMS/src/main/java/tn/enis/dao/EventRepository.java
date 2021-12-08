package tn.enis.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.bean.Event;


public interface EventRepository extends JpaRepository<Event, Long>{
	Event findEventByTitre(String titre);
	List<Event> findByTitreStartingWith(String caractere);
	Event findEventById(Long id);
	List<Event> findByDate(Date date);
	List<Event> findByLieu(String lieu);

}
