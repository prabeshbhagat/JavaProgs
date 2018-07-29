package list;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
ArrayList al =new ArrayList();
al.add(23);
al.add(45);
al.add(67);
al.add(23);
al.add(2);
al.add(1, 88);
al.get(4);
al.toArray();
System.out.println("size of arraylist is:"+al.size());
System.out.println("using for loop");
for(int i=0;i<al.size();i++){
	System.out.println(al.get(i));
	System.out.println("usin for each loop");
	for(Object k:al){
		System.out.println(k);
	}
}
	}

}
