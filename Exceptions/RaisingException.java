package com.ojm18.Exceptions;

import java.util.Scanner;

public class RaisingException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String cnf;
		Account a1 = new Account(1000);
		do{
		System.out.println("welcom to bank atm..");
		System.out.println("press 1 for bal info..");
		System.out.println("press 2 to withdraw..");
		int t = scn.nextInt();
		if(t==1)System.out.println("ur bal is: "+a1.bal);
		else if(t==2){
			System.out.println("enter amount: ");
			int amt = scn.nextInt();
			try{
				a1.withDraw(amt);
			}catch(InsufficientFundException e){
				System.out.println(e);
			}
		}else{
			System.out.println("pls provide a valid input..");
		}
		System.out.println("do you want to continue? (y/n)..");
		cnf = scn.next();
		
		}while(cnf.equals("y"));
		System.out.println("thank you...");
		scn.close();
	}
}
class Account{
	int bal;
	Account(int bal){
		this.bal = bal;
	}
	public void withDraw(int amt)throws InsufficientFundException{
		if(amt<=bal){
			System.out.println("collect money..");
		}else{
			String s = "less amount..";
			throw (new InsufficientFundException(s));
		}
	}
}
class InsufficientFundException extends Exception{
	String errMsg;
	InsufficientFundException(String errMsg){
		this.errMsg=errMsg;
	}
	public String toString(){
		return errMsg;
	}
}
