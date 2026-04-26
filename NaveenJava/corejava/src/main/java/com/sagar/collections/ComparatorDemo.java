package com.sagar.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	
	int age;	
	String name;	
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}	
}

//class CompareAge implements Comparator<Student> 
//{			
//	@Override
//	public int compare(Student o1, Student o2) {
//		if (o1.age > o2.age) 
//			return 1;
//		else
//			return -1;
//	}
//}

public class ComparatorDemo {	

	public static void main(String[] args) {
		
//		Normal way
		
//		Comparator<Student> com = new Comparator<Student>() {			
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.age > o2.age) 
//					return 1;
//				else
//					return -1;
//			}
//		};
		
//		Using Lambda expression		
//		step 1 using Lambda
//		Comparator<Student> com = (Student o1, Student o2) -> {
//				if (o1.age > o2.age) 
//					return 1;
//				else
//					return -1;
//		};
		
//		step 2 using Lambda using ternary operator
//		Comparator<Student> com = (Student o1, Student o2) -> { return (o1.age > o2.age)?1:-1; };
		
//		step 3 using Lambda. Removing Student. no  need to mention
//		Comparator<Student> com = (o1, o2) -> { return (o1.age > o2.age)?1:-1; };
		
//		step 4 using Lambda. Removing curly brackets and return statement
		Comparator<Student> com = (o1, o2) -> (o1.age > o2.age)?1:-1;
		
		List<Student> studs=new ArrayList<Student>();
		
		Student std1=new Student(18,"Sagar");
		Student std2=new Student(14,"Ravi");
		Student std3=new Student(67,"Suresh");
		Student std4=new Student(93,"Naresh");
		Student std5=new Student(5,"Sanju");
		Student std6=new Student(26,"Murali");
		
		studs.add(std1);
		studs.add(std2);
		studs.add(std3);
		studs.add(std4);
		studs.add(std5);
		studs.add(std6);

//		CompareAge com = new CompareAge();
		
		Collections.sort(studs,com);
		
		for (Student student : studs) {			
			System.out.println(student);
		}
		
		
	}

}
