package ArrayLists;
import java.util.*;

public class AddallExample {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Atif");
		list1.add("Karan");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Kiran");
		list2.add("Rajesh");
		//adding all the the elements from lists2 ro list1
		list1.addAll(list2);
		Iterator<String> it=list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//using for-each loop
		
		for(String element:list1) {
			System.out.println(element);
		}
		
		//r

	}

}
