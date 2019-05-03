package org.cjs.midterm1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SubscriptionMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"midterm1-context.xml");
		SubscriptionService subscriptionService = context
				.getBean("subscriptionService", SubscriptionService.class);

		subscriptionService.subscribe();
		subscriptionService.listSubscriptions();
		context.close();
	}
}