package PatternPrinting;

public class Demo5 {

	public static void main(String[] args) {

		for (int i = 10; i >= 1; i--) {
			for (int j = 10; j >= 1; j--) {
				System.out.printf("%4d", i);
			}
			System.out.println();
		}

	}

}
