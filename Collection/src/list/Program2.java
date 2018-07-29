package list;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
ArrayList al =new ArrayList();
al.add(23);
al.add(45);
al.add(67);
al.add(23);
al.add(2);
System.out.println(al);
System.out.println("toarrya");
Object[] k=al.toArray();
for(int i=0;i<=k.length-1;i++){
	System.out.println(k[i]);
}
	
	}

}
