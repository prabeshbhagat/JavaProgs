
public class TestTeacher {

	public static void main(String[] args) {
Teacher t1=Teacher.getInstance();
t1.teach();
Teacher t2=Teacher.getInstance();
t2.teach();
	}

}
 class Teacher{
	private static Teacher t;
	private Teacher(){
		
	}

 public static  Teacher getInstance(){
	 
	 if(t==null){
		t=new Teacher();
	 }
		return t;
	
}
 
 public void teach(){
System.out.println("teaching");
 }
}