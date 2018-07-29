
public class Test1 {

	public static void main(String[] args) {
		int count = 0;
		int n = 43526;
		while(n>0){
			count = (n%10) + count;
			n = n/10;
		}
		System.out.println(count);
		
	}
}
