package PatternPrinting;

public class Demo6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.printf("%4c",(char)(i+64));
			}
			System.out.println();
		}

	}

}
