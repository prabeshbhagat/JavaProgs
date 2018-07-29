package downcasting;


public class Test {

	public static void main(String[] args) {
		Dog d=new PoliceDog();
		d.getType();
		PetDog pd=(PetDog)d;
		pd.getSleep();
		pd.getType();
		PoliceDog p=(PoliceDog)d;
		p.getSleep();
		p.getType();
		p.getWork();
		
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


