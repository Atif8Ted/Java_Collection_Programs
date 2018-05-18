package LinkedLists;
import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Rajesh");
		//Using iterator to display.
		Iterator <String>it=list.iterator();
		System.out.println("Using Iterator to view Lined List");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using for-each loop
		System.out.println();
		System.out.println("Using for each");
		System.out.println();
		
		for(String a:list) {
			System.out.println(a);
		}
		
	}

}
