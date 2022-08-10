package com.conduira.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		numberprint numpr=new numberprint(5,10);
		ExecutorService executor=Executors.newFixedThreadPool(5);
		executor.submit(new sequence(numpr,0));
		executor.submit(new sequence(numpr,1));
		executor.submit(new sequence(numpr,2));
		executor.submit(new sequence(numpr,3));
		executor.submit(new sequence(numpr,4));
		executor.shutdown();
	}

}
