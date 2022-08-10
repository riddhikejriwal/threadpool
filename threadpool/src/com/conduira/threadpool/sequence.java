package com.conduira.threadpool;

public class sequence implements Runnable{
	private numberprint numpr;
	private int result;
	
	public sequence(numberprint numpr, int result) {
		super();
		this.numpr = numpr;
		this.result = result;
	}
 
	@Override
	public void run() {
		numpr.printNumbers(result);
	}
}
