package demo6;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
int[]a={23,10,55,67,88,45};
int temp;
for(int i=0;i<=a.length-2;i++){
	for(int j=0;j<=a.length-2;j++){
if(a[j]>a[j+1]){
	temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
}
}}


	System.out.println("-----------------------");	
	Arrays.sort(a);
	for(int k:a){
		System.out.println(k);
	}
	}
	}


