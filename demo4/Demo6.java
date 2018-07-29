package demo4;

public class Demo6 {

	public static void main(String[] args) {
int []a={ 23,24,18,17,9,8};
	int temp;
	for(int i=0;i<=a.length-2;i++){
		for(int j=0;j<=a.length-2;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}}
		for(int k:a){
			System.out.println(k);
	}

	

	
}
	
}
