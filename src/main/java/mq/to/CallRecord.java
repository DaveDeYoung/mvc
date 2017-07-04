package mq.to;

import java.util.Date;

public class CallRecord {
	
	public Date recevieDate;
	
	public String RequestContent;

	public String getRequestContent() {
		return RequestContent;
	}

	public void setRequestContent(String requestContent) {
		RequestContent = requestContent;
	}

	public Date getRecevieDate() {
		return recevieDate;
	}

	public void setRecevieDate(Date recevieDate) {
		this.recevieDate = recevieDate;
	}
	
}
