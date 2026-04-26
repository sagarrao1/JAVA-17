package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator with Custom type class student
// Want to sort objects on basis of student marks
public class ComparatorDemo2 {
	public static void main(String[] args) {
		
		List<Student> studs=new ArrayList<Student>();
		
		Student std1=new Student(1,85);
		Student std2=new Student(2,35);
		Student std3=new Student(3,45);
		Student std4=new Student(4,65);
		Student std5=new Student(5,92);
		Student std6=new Student(6,67);
		
		studs.add(std1);
		studs.add(std2);
		studs.add(std3);
		studs.add(std4);
		studs.add(std5);
		studs.add(std6);
		
		/*Comparator<Student> c= new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
					return o1.marks>o2.marks?-1:1;  // ternary operator ?
			}
			
		}; */
		
		//((Student o1, Student o2)  -> {  return o1.marks>o2.marks?-1:1;	 })
		
		Collections.sort(studs, ((Student o1, Student o2)  -> {  return o1.marks>o2.marks?-1:1;	 }));
				
		
		for (Student s : studs) {
			System.out.println(s);
		}
	}
}

