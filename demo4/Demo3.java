package demo4;

public class Demo3 {

	public static void main(String[] args) {
int []a=new int[4];
a[0]=10;
a[1]=23;
a[2]=35;
a[3]=67;


for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
}
System.out.println("using for-each loop");
for(int i:a){
	System.out.println(i);
}
	}

}
