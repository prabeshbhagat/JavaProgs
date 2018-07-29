package hashset;

import java.util.LinkedHashSet;

public class Run1 {

	public static void main(String[] args) {
LinkedHashSet ls=new LinkedHashSet();
ls.add(25);
ls.add(26);
ls.add(27);
ls.add(28);
ls.add(29);
ls.add(30);
System.out.println(ls);
System.out.println("using for each loop");
for(Object ks:ls){
	System.out.println(ks);
}
	}

}
