package PatternPrinting;

public class Demo3 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 100; i++) {
//
//			System.out.printf("%4d", i);
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//
//		}
		int count=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.printf("%4d",count++);
			}
			System.out.println();
		}
		

	}

}
