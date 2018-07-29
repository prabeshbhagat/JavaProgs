package com.ojm18.stringClass;

public class CheckingAskeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s1 = "link2sbi*650";
		char c;
		for(int i =0;i<=s1.length()-1;i++){
			c = s1.charAt(i);
			if(c > 47 && c <58){
				System.out.println(c);
			}
			
		}
	}

}
