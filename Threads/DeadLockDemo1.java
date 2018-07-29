package com.ojm18.Threads;

public class DeadLockDemo1 {

	public static void main(String[] args) {

		final String s1 = "ram";
		final String s2 = "sam";
		Thread t1 = new Thread() {

			public void run() {
				synchronized (s1) {
					System.out.println("t1 has locked s1..");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println("t1 has locked s2");
					}
				}
			}

		};
		Thread t2 = new Thread() {

			public void run() {
				synchronized (s2) {
					System.out.println("t2 has locked s2..");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s1) {
						System.out.println("t2 has locked s1");
					}
				}
			}

		};
		t1.start();
		t2.start();

	}

}
