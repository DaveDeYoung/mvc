package mq.service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class CameraSender {
	
	@Resource
	JmsTemplate jmsTemplate;
	
	public void send(String queueName,final String msg) {
		jmsTemplate.send(queueName, new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});
	}

}
