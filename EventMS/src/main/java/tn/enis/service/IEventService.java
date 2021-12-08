package tn.enis.service;

import java.util.Date;
import java.util.List;
import tn.enis.bean.Event;

public interface IEventService {
	public Event addEvent(Event e);
	public void deleteEvent(Long id) ;
	public Event updateEvent(Event p) ;
	public Event findEventById(Long id) ;
	public List<Event> findAll();
	
	public Event findByTitre(String titre);
	public List<Event> findByLieu(String lieu);
	public List<Event> findByDate(Date date);
	
	public List<Event> findByTitreStartingWith(String caractere);
	
	

}
