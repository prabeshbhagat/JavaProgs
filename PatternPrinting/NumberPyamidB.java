package PatternPrinting;

public class NumberPyamidB {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if ((i + j) > 4) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
