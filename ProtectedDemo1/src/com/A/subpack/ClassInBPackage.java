package com.A.subpack;

import com.A.A;

public class ClassInBPackage extends A{
	void method1(){
		A a = new A();
		System.out.println(a.a);
	}
}
