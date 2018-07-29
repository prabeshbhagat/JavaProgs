package demo;

class Phone{
	int height;
	int width;
	int length;
	Phone(int a,int b,int c){
		height=a;
		width=b;
		length=c;
	}
}
class CameraPhone extends Phone{
	int pixels;
	CameraPhone(int a,int b,int c,int p){
		super(a,b,c);
		pixels=p;
		System.out.println("cameraphone created");
	}
}
class MusicPhone extends Phone{
	int vol;
	MusicPhone(int a,int b,int c,int v){
		super(a,b,c);
		vol=v;
		System.out.println("music phone created");
	}
}
public class ChainInheritance {

	public static void main(String[] args) {
MusicPhone m=new MusicPhone(2,4,6,8);
CameraPhone c=new CameraPhone(3,4,6,8);
	}

}
