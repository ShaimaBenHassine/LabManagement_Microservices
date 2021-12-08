package tn.enis;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tn.enis.bean.Event;
import tn.enis.dao.EventRepository;
import tn.enis.service.IEventService;

@SpringBootApplication
@EnableDiscoveryClient
public class EventMsApplication implements CommandLineRunner{
	@Autowired
	IEventService eventService;
	@Autowired
	EventRepository eventRepository;
	public static void main(String[] args) {
		SpringApplication.run(EventMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Date d = new Date();
		Date a = new Date("2021/04/12");
		Event e = new Event("ieeeDay", d, "ENIS");
		eventRepository.save(e);
		Event s = new Event("PESWeek", a, "FSS");
		eventRepository.save(s);
		Event m= eventService.findEventById(2L);
		m.setTitre("extreem");
		eventService.updateEvent(m);
		//eventService.deleteEvent(1L);
	}

}
