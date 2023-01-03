package com.spring.jms.sender;

import java.util.UUID;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.spring.jms.config.JmsConfig;
import com.spring.jms.model.JMSMessage;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JMSSender {

	private final JmsTemplate jmsTemplate;

	@Scheduled(fixedRate = 2000)
	public void sendJMSMessage() {
		System.out.println("Hello i'm sendin a message");
		JMSMessage message = JMSMessage.builder().id(UUID.randomUUID()).message("test JMS Message !").build();
		jmsTemplate.convertAndSend(JmsConfig.QUEUE,message);
		System.out.println("Message Sent");
	}

}
