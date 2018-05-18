package LinkedLists;
import java.util.*;
class Book{
	int id;
	String name;
	int quantity;
	
	Book(int id,String name,int quantity){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
}

public class BookUsingLinkedlist {

	public static void main(String[] args) {
		LinkedList<Book>library=new LinkedList<Book>();
		Book b1=new Book(1,"Let us C",5);
		Book b2=new Book(2,"Python",5);
		Book b3=new Book(1,"GoLang",5);
		library.add(b1);
		library.add(b2);
		library.add(b3);
		//usinf for each loop
		System.out.println("Using for each loop");
		
		for(Book b:library) {
			System.out.println(b.id+" "+b.name+" "+b.quantity);
		}
		System.out.println("Using Iterator \n");
		
		Iterator<Book> it=library.iterator();
		while(it.hasNext()) {
			Book b=(Book)it.next();
			System.out.println(b.id+" "+b.name+" "+b.quantity);
			
		}
		LinkedList<Book>library2=new LinkedList<Book>();
		library.addAll(library);
		
		Iterator<Book> it1=library.iterator();
		while(it1.hasNext()) {
			Book b=(Book)it1.next();
			System.out.println(b.id+" "+b.name+" "+b.quantity);
		

		
	}

}
}