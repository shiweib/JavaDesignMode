package com.gg.producerConsumer.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private Object[] objs = new Object[10];
	private int count = 0;
	
	private Lock lock = new ReentrantLock();
	private Condition produceCondition = lock.newCondition();
	private Condition consumerCondition = lock.newCondition();
	
	public void produce(int id) throws InterruptedException{
		lock.lock();
		try {
			produceCondition.await();
			objs[count] = id;
			count = (count + 1)%10;
			consumerCondition.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public int consumer() throws InterruptedException{
		lock.lock();
		int id = 0;
		try {
			consumerCondition.await();
			id = (int) objs[count];
			objs[count] = 0;
			produceCondition.signalAll();
		} finally {
			lock.unlock();
		}
		return id;
	}
}
