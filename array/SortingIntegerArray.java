package com.ojm18.array;

import java.util.Arrays;

public class SortingIntegerArray {

	public static void main(String[] args) {
		
		int a[] = {4,2,6,8,7,5,3};
		int temp;
		for(int i = 0;i<=(a.length-2);i++){
			for(int j = 0;j<=(a.length-2);j++){
				
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
