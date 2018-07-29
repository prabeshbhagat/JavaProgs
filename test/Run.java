package test;

public class Run {
static int count;
Run(){
	count++;
}
	public static void main(String[] args) {
Run r1=new Run();
Run r2=new Run();
Run r3=new Run();
System.out.println(count);
	}

}
