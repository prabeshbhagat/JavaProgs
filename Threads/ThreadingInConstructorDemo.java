package com.ojm18.Threads;

public class ThreadingInConstructorDemo {

	public static void main(String[] args) {
		new Runnable01();
		for (int i=1;i<=15;i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Runnable01 implements Runnable{
	public Runnable01() {
		new Thread(this).start();
	}
	@Override
	public void run() {
		for (int i=45;i<=65;i++){
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}