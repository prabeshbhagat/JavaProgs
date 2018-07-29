
public class Tester2 {

	public static void main(String[] args) {
	//	Mobile mobile = new Mobile(13, 45);
		//CameraMobile cameraMobile = new CameraMobile(12, 4, 13);
		Multimedia multimedia = new Multimedia(15, 5, 15, 9);
	}

}

class Mobile{
	public Mobile(int l, int h) {
		System.out.println("mobile havng prry of lenght : "+l+", height : "+h);
	}
	
}

class CameraMobile extends Mobile{
	
	public CameraMobile(int l,int h, int mp) {
		super(l,h);
		System.out.println("camera mobile having proeryy of -- length :"+l+", height :"+h+", megapixel:"+mp);
	}
	
}

class Multimedia extends CameraMobile{
	public Multimedia(int l, int h, int mp, int watt) {
		super(l,h,mp);
		System.out.println("multimdia mobile having proeryy of -- length:"+l+", height :"+h+", megapixel:"+mp+", spkr : "+watt);
		
	}
}