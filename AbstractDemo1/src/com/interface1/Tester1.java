package com.interface1;

public class Tester1 {

	public static void main(String[] args) {
//		Bulb b = new CFL();
		Bulb b = new TubeLight();
		b.on();
		b.off();
	//	b.m1();
	}

}

interface Bulb{
	void on();
	void off();
//	void m1(){  }
}

class CFL implements Bulb{
	@Override
	public void on() {
		System.out.println("cfl on");
	}
	@Override
	public void off() {
		System.out.println("cfl off");
	}
	void m1(){ }
}

class TubeLight implements Bulb{
	@Override
	public void on() {
	System.out.println("tubelight on");
	}
	@Override
	public void off() {
	System.out.println("tubelight off..");
	}
}