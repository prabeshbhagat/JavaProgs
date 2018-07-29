package com.ojm18.equalsMethod;

public class Run4 {

	public static void main(String[] args) {
		Car c1 =new Car(250000, new Engine(1000));
		Car c2 =new Car(250000, new Engine(1000));
		Car c3 =new Car(250000, new Engine(1200));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("comparing c1 with c2: " +c1.equals(c2));
		System.out.println("comparing c1 with c3: " +c1.equals(c3));
	}

}

class Engine{
	int cc;
	Engine(int cc){
		this.cc = cc;
	}
		public String toString(){
			return "cc = " +cc;
		}
		public boolean equals(Object x){
			Engine e1 = (Engine)x;
			return this.cc == e1.cc;
		}		
	}

class Car{
	long price;
	Engine eng;
	Car(long price, Engine eng){
		this.price=price;
		this.eng = eng;
	}
	public String toString(){
		return price+","+eng;
	}
	public boolean equals(Object x){
		Car c1 = (Car)x;
		return price == c1.price && eng.equals(c1.eng);
	}	
}