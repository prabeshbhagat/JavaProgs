package upcasting;

public class Test {

	public static void main(String[] args) {
Dog d1=new PetDog();
d1.getType();
PetDog p1=new PoliceDog();
p1.getSleep();
p1.getType();
	}

}

class Dog{
	void getType(){
		System.out.println("normal dog");
	}
}
class PetDog extends Dog{
	void getType(){
		System.out.println("pet dog");
	}
void getSleep(){
	System.out.println("in bed");
}
}
class PoliceDog extends PetDog{
	void getType(){
		System.out.println("police dog");
		
	}
	void getWork(){
		System.out.println("investigation");
	}
}