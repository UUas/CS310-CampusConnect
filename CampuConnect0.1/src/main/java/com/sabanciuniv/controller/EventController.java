package com.sabanciuniv.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sabanciuniv.Application;
import com.sabanciuniv.model.Event;
import com.sabanciuniv.payload.EventId;
import com.sabanciuniv.payload.EventPayload;
import com.sabanciuniv.repository.EventRepo;



@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired EventRepo eventRepo;
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@GetMapping("/sayhello")
	public String sayHello() {
		return "Hello from Spring Rest!";
	}
	
	@PostMapping("/geteventid")
	public Event getEventID(@RequestBody EventId id) {
		logger.info(LocalDateTime.now() + " User info is requested for user with ID: " + id.getId());
		
		List<Event> userList = eventRepo.findByEventId(id.getId());
		Event event = new Event();
		event = userList.get(0);
		return event;
	}
	
	
	@PostMapping("/createevent")
	public EventId createUser(@RequestBody EventPayload eventToAdd) { //UserToAdd
		logger.info(LocalDateTime.now() + " User Requested adding new user to database with name: " + eventToAdd.getEventName());
		
		
		Event event = eventRepo.insert(new Event(eventToAdd.getEventName(),eventToAdd.getLocation(),eventToAdd.getDate(),eventToAdd.getTopic(),eventToAdd.getText(),eventToAdd.getClub()));
		
		logger.info("User added with Id: " + event.getEventId());
		
		EventId eventIdMessage = new EventId(event.getEventId());
		return eventIdMessage;
	}
	
	@GetMapping("/getallevents")
	public List<Event> getAllUsers(){
		return eventRepo.findAll();
	}
	
}
	
	