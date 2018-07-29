package equals;

public class EngineTest {

	public static void main(String[] args) {
Car c1=new Car(200000,new Engine(1000));
Car c2=new Car(200000,new Engine(1000));
System.out.println(c1.equals(c2));
	}

}
class Engine{
	int cc;
	Engine(int cc){
		this.cc=cc;
	}
	public String toString(){
		return "cc"+cc;
	}
	public boolean equals(Object x){
		return this.cc==((Engine)x).cc;
	}
}
class Car{
	long price;
	Engine eng;
	Car(long p,Engine e){
		price=p;
		eng=e;
	}
	public String toString(){
		return "["+price+", "+eng+"]";
	}
	public boolean equals(Object x){
		Car c=(Car)x;
		return price==c.price && eng.equals(c.eng);
	}
}