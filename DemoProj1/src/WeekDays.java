import java.util.Scanner;


public class WeekDays {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
	System.out.println("enter a no");
	int n= scn.nextInt();
	switch(n)
	{
	case 1:System.out.println("monday");
	break;
	case 2:System.out.println("tue");
	break;
	case 3:System.out.println("wed");
	break;
	default:System.out.println("invalid no");

	}


	}

}
