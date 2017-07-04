package mq.converter;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import mq.to.CallRecord;

public class HxMessageConverter implements MessageConverter {

	public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object fromMessage(Message message) throws JMSException, MessageConversionException {
		TextMessage mqMessage = (TextMessage) message;
		CallRecord callRecord = new CallRecord();
		callRecord.setRecevieDate(new Date());
		callRecord.setRequestContent(mqMessage.getText());
		return callRecord; 
	}

}
