package ArrayLists;
import java.util.*;

public class Arrayss {

	public static void main(String[] args) {
		ArrayList<String>lists=new ArrayList<String>();
		lists.add("Ravi");
		lists.add("Vikash");
		lists.add("Rajesh");
		
		/*Method 1 to print Arraylist
		 * for(String ax:lists) {
			System.out.println(ax);
		}*/
		
		/* Method 2 to print
		 * Using iterator
		 * */
		
		Iterator<String> itr=lists.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
