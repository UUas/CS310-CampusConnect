package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Events;

public interface EventRepo extends MongoRepository<Events, String> {
	public Events findEventsByName(String name);
	public List<Events> findEventsByTopic(String topic);
	
}
