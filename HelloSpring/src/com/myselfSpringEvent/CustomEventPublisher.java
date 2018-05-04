package com.myselfSpringEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		 this.publisher = arg0;
	}
	 public void publish() {
	      CustomEvent ce = new CustomEvent(this);
	      publisher.publishEvent(ce);
	   }
}
