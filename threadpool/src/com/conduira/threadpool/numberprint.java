package com.conduira.threadpool;

public class numberprint {
	private int startnum = 1;
	private int numThreads=5;
	private int totalnum=10;
	
	public numberprint (int numThreads, int totalnum) {
		super();
		this.numThreads = numThreads;
		this.totalnum = totalnum;
	}
	
	public void printNumbers(int result) {
		synchronized (this) {
			while (startnum < totalnum-3) {
				while (startnum % numThreads != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" :: "+startnum++);
				notifyAll();
			}
		}
	}
}
