package com.ojm18.Threads;

public class MyThread1 extends Thread {
	
	public void run(){
		for (int i =65;i<80;i++){
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
