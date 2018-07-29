package demo5;

import java.util.HashSet;

public class Run3 {

	public static void main(String[] args) {
HashSet hs=new HashSet();
hs.add("kala");
hs.add("bala");
hs.add("mala");
hs.add("tala");
System.out.println(hs);
for(Object ele:hs){
	System.out.println(ele);
}
hs.remove(2);
System.out.println(hs);
	}

}
