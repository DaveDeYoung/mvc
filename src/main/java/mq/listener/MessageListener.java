package mq.listener;

import mq.to.CallRecord;

public class MessageListener {
	
	public void receviedMessage(CallRecord callRecord) {  
        System.out.println(callRecord.getRequestContent());  
    }  

}
