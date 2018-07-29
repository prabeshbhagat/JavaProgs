package com.qspiders.abstarctiondemo;

import com.qspiders.polmorpohdemo.C;

public class Tester {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		
		C c = new C();
//		c.m1(); cant access default method outside og the package
	}

}
