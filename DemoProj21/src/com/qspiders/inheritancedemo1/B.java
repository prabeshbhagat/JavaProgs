package com.qspiders.inheritancedemo1;

import com.qspiders.abstarctiondemo.A;
import com.qspiders.polmorpohdemo.C;

public class B {
	A a = new A();
	com.qspiders.polmorpohdemo.A a1 = new com.qspiders.polmorpohdemo.A();
	
	static void m1(){
		System.out.println(C.a);
	}
}
