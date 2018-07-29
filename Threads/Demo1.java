package com.ojm18.Threads;

public class Demo1 {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread1();
		//or
		//MyThread1 mt1 = new MyThread1();
		//Thread t1 = new Thread(mt1);
		t1.start();
		for (int i=1;i<16;i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
