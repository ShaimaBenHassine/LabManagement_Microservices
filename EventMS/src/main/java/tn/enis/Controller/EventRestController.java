package tn.enis.Controller;

import java.util.Date;
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


import tn.enis.bean.Event;

import tn.enis.service.IEventService;

@RestController
public class EventRestController {
	@Autowired
	IEventService eventService;
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public List<Event> findEvents() {
		return eventService.findAll();
	}

	@GetMapping(value = "/event/{id}")

	public Event findOneEventById(@PathVariable Long id) {

		return eventService.findEventById(id);
	}

	@GetMapping(value = "/event/search/titre")

	public Event findOneEventByTitre(@RequestParam String titre) {
		return eventService.findByTitre(titre);
	}

	@GetMapping(value = "/event/search/lieu")

	public List<Event> findOneEventByLieu(@RequestParam String lieu) {
		return eventService.findByLieu(lieu);
	}
	@GetMapping(value = "/event/search/date")

	public List<Event> findOneEventByDate(@RequestParam Date date) {
		return eventService.findByDate(date);
	}
	@PostMapping(value = "/event/save")

	public Event addEvent(@RequestBody Event m) {
		return eventService.addEvent(m);

	}

	
	@DeleteMapping(value = "/event/{id}")

	public void deleteEvent(@PathVariable Long id) {

		eventService.deleteEvent(id);

	}

	@PutMapping(value = "/event/{id}")

	public Event updateEvent(@PathVariable Long id, @RequestBody Event p){
		p.setId(id);
		return eventService.updateEvent(p);

	}


	
}
