package com.ojm18.Threads;

public class Aa {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		 Thread t1 = new Thread(mt);
		 t1.start();
	}

}
