package com.ojm18.array;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		a[0] = 10;
		a[1]++;
		a[2] = a[0] + 10;
		a[3] = 30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		System.out.println("size of array: "+a.length);
		System.out.println("iterating for : ");
		for(int i =0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		System.out.println("iterating for each : ");
		for(int i:a){
			System.out.println(i);
		}
	}

}
