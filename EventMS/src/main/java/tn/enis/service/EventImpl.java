package tn.enis.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.bean.Event;

import tn.enis.dao.EventRepository;
@Service
public class EventImpl implements IEventService{
	@Autowired
	EventRepository eventRepository;
	@Override
	public Event addEvent(Event e) {
		eventRepository.save(e);
		return e;
	}

	@Override
	public void deleteEvent(Long id) {
		if(eventRepository.findById(id).isPresent())
			eventRepository.deleteById(id);
		
	}

	@Override
	public Event updateEvent(Event p) {
		
		return eventRepository.saveAndFlush(p);
	}

	@Override
	public Event findEventById(Long id) {
		Event m= (Event)eventRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Event> findAll() {
		
		return eventRepository.findAll();
	}

	@Override
	public Event findByTitre(String titre) {
		
		return eventRepository.findEventByTitre(titre);
	}

	@Override
	public List<Event> findByLieu(String lieu) {
		return eventRepository.findByLieu(lieu);
	}

	@Override
	public List<Event> findByDate(Date date) {
		
		return eventRepository.findByDate(date);
	}

	@Override
	public List<Event> findByTitreStartingWith(String caractere) {
		return eventRepository.findByTitreStartingWith(caractere);
	}

}
