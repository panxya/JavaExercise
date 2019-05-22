package it.cast_09;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		
		ExecutorService es =Executors.newFixedThreadPool(2);
		
		Future<Integer> e1 = es.submit(new MyCallable(100));
		Future<Integer> e2 = es.submit(new MyCallable(10));
		
		Integer i1 = e1.get();
		Integer i2 = e2.get();
		
		System.out.println(i1);
		System.out.println(i2);
		
		es.shutdown();
	}
}
