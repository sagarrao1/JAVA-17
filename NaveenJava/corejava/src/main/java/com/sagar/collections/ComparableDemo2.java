package com.sagar.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2  implements Comparable<Student2>  
{	
	int age;	
	String name;	
	
	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student2 that) {
		if (this.age > that.age) 
		return 1;
	else
		return -1;
	}		
}

public class ComparableDemo2 {	

	public static void main(String[] args) {
		
		List<Student2> studs=new ArrayList<Student2>();
		
		Student2 std1=new Student2(18,"Sagar");
		Student2 std2=new Student2(14,"Ravi");
		Student2 std3=new Student2(67,"Suresh");
		Student2 std4=new Student2(93,"Naresh");
		Student2 std5=new Student2(5,"Sanju");
		Student2 std6=new Student2(26,"Murali");
		
		studs.add(std1);
		studs.add(std2);
		studs.add(std3);
		studs.add(std4);
		studs.add(std5);
		studs.add(std6);
		
		Collections.sort(studs);
		
		for (Student2 student2 : studs) {			
			System.out.println(student2);
		}		
	}

}
