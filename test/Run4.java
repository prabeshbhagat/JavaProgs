package test;

public class Run4 {

	public static void main(String[] args) {
String s1="katak";
String s2="";
for(int i=s1.length()-1;i>=0;i--){
	s2+=s1.charAt(i);
	
}
System.out.println(s1.equals(s2));
	}

}
