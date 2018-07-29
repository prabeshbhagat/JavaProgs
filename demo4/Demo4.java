package demo4;

public class Demo4 {

	public static void main(String[] args) {
int []a={10,12,17,1,3};
int big=a[0];
for(int i=0;i<a.length;i++){
	if(a[0]<a[i])
	{
		big=a[i];
	}
}
System.out.println("biggest no is :"+big);	
	}
}
