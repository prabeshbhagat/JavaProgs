package upcasting;

import java.util.Scanner;

class CarFactory{
	static Car getCar(){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter car rtpe");
		String carType=scn.next();
		Car c=null;
		if (carType.equals("audi")){
			c=new Audi();
		}
		else if(carType.equals("benz")){
			c=new Benz();
		}
		return c;
	}
}
public class Run3 {

	public static void main(String[] args) {
		Car c=CarFactory.getCar();

	}

}
