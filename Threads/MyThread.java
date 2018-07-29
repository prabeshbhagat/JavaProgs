package com.ojm18.Threads;

public class MyThread extends Thread {
	public void run(){
		for (int i=1;i<=15;i++){
			System.out.println(i);
		}
	}
}

