package com.ojm18.array;

public class LargestSmallestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15,10,12,14,16};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=1;i<a.length;i++){
			if(largest < a[i]){
				largest = a[i];
			}
			if(smallest>a[i]){
				smallest = a[i];
			}
		}
		System.out.println("largest: "+largest);
		System.out.println("smallest:"+smallest);
	}

}
