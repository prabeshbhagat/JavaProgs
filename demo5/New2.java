package demo5;

public class New2 {

	public static void main(String[] args) {
int[]a=new int[4];
a[0]=23;
a[1]=28;
a[2]=20;
a[3]=26;

for(int k:a){
	System.out.println(k);
}
int big=a[0];
int small=a[0];
for(int i=0;i<a.length-1;i++){
	if (big< a[i]){
		big=a[i];
		}
	else if(small>a[i]){
		small=a[i];
	}}
	System.out.println("biggest no is"+big);
	System.out.println("smallest no is"+small);
}
	

}
