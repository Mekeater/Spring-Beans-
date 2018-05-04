package com.SpringEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
	public void onApplicationEvent(ContextStartedEvent evevt) {
		System.out.println("ContextStartedEvent Received");
	}
}
