package ArrayLists;
import java.util.*;

class Book{
	int id;
	String name;
	int quantity;
	public Book(int id,String name,int quantity) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
}

public class BooksUsingArrayList {

	public static void main(String[] args) {
		List<Book>library=new ArrayList<Book>();
		Book b1=new Book(1,"Let Us C",5);
		Book b2=new Book(2,"Head-First Java",4);
		Book b3=new Book(3,"Advance Unix Programming",6);
		library.add(b1);
		library.add(b2);
		library.add(b3);
		
		for(Book a:library) {
			System.out.println(a.id+" "+a.name+""+a.quantity);
		}
		//using iterator
		Iterator<Book> it= library.iterator();
		while(it.hasNext()) {

			Book b=(Book)it.next();
			System.out.println(b.id+" "+b.name+" "+ b.quantity);

		}
		
	}

}
