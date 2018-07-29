package com.ojm18.Threads;

public class StaticSynchronization {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Table1.printTable(1);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Table1.printTable(2);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				Table1.printTable(3);
			}
		};
	t1.start();
	t2.start();
	t3.start();
	}

}

class Table1 {
	synchronized static void printTable(int n) {
		System.out.println("table of: "+n);
		for (int i = 1; i <= 10; i++) {
			System.out.print(n * i);
			System.out.print(" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
