package com.spring.jms.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JMSMessage implements Serializable{
	static final long serialVersionUID = 4200212121212002022L;
	private UUID id ;
	private String message;

}
