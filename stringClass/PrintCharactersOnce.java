package com.ojm18.stringClass;

public class PrintCharactersOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "i am an idiot";
		String s2 = "";
		char c;
		for (int i = 0; i<= s1.length()-1;i++){
			c = s1.charAt(i);
			
			if (s2.indexOf(c)== -1)
			{
				s2 = s2 + c ;
			}
		}
		System.out.println(s2);
	}

}
