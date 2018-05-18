package ArrayLists;
import java.util.*;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class UserDefinedClassObjectsInJavaArrayList {
	//creating user-defined class objects.
	

	public static void main(String[] args) {
		Student s1=new Student(101,"Atif",22);
		Student s2=new Student(102,"Rajesh",23);
		Student s3=new Student(103,"Karan",22);
		//creating arraylist
		ArrayList<Student> lists=new ArrayList<Student>();	
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		
		//Getting iterator.
		Iterator<Student> it=lists.iterator();
		while(it.hasNext()) {
			Student st=(Student)it.next();
			System.out.println(st.rollno+" "+st.age+" "+ st.name);
		}
		
		//using for-each
		for(Student a:lists) {
			Student st= (Student)a;
			System.out.println(st.rollno+" "+st.age+" "+ st.name);

		}
	}

}
