import java.util.Scanner;


public class ReadInput {

	public static void main(String[] args) {
		System.out.println("pgm stsrts");
		Scanner scn = new Scanner(System.in);
		System.out.println("name");
		String un =scn.next();
		System.out.println("age");
		int age=scn.nextInt();
		System.out.println("ur name and age is");
		System.out.println(un);
		System.out.println(age);
		System.out.println("pgn ends");

	}

}
