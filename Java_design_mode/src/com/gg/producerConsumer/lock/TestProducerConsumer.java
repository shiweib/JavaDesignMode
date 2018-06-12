package com.gg.producerConsumer.lock;

import org.junit.Test;

public class TestProducerConsumer {

	

	@Test
	public void testProducer() throws InterruptedException{
		Service service = new Service();
		service.produce(1);
		int consumer = service.consumer();
		System.out.println(consumer);
	}
}
