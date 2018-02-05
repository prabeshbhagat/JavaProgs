package PatternPrinting;

public class SquarePatternPrinting {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || i == 4) {
					System.out.print("* ");
				} else if (j == 0 || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}
	// TODO Auto-generated method stub
}
