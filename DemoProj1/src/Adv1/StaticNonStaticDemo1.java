package Adv1;

public class StaticNonStaticDemo1 {

	public static void main(String[] args) {
		
		System.out.println(Account.name);
	//  System.out.println(Account.acNo);
		
		Account ac1 = new Account();
		ac1.acNo = 7654;
		
		Account ac2 = new Account();
		ac2.acNo = 876786;
		
		System.out.println(ac1.acNo);
		System.out.println(ac2.acNo);
		
		System.out.println(ac1.name);
		
	}

}

class Account {
	
	static String name = "sbi";
		int acNo;
}