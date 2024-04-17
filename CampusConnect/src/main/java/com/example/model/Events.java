package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
@Document("Events")
public class Events {
	
	@Id private String eventId;
	
	@DBRef
	private String eventName;
	@DBRef
	private String clubName;
	@DBRef
	private String location;
	@DBRef
	private LocalDateTime eventTime;
	@DBRef
	private String topic;
	@DBRef
	private String text;
	
	

}
