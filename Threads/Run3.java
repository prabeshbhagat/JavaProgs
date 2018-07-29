package com.ojm18.Threads;

public class Run3 {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		new PrintThread(printer,"bangalore");
		new PrintThread(printer,"chennai");
		new PrintThread(printer,"mumbai");

	}

}

class Printer{
	synchronized public void print(String msg){
		System.out.print("[");
		for (int i=0;i<=msg.length()-1;i++){
			System.out.print(msg.charAt(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("]");
	}
}
class PrintThread implements Runnable{
	Printer printer;
	String msg;
	PrintThread( Printer p, String msg){
		printer = p;
		this.msg = msg;
		new Thread(this).start();
	}
	public void run(){
		printer.print(msg);
	}
}