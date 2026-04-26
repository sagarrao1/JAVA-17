package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {			
			List<Student> studs=new ArrayList<Student>();			
			studs.add(new Student(1,83));
			studs.add(new Student(2,35));
			studs.add(new Student(3,45));
			studs.add(new Student(4,65));
			studs.add(new Student(5,94));
			studs.add(new Student(6,67));	
			
		/*
		 * Comparator<Student> c= new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.marks>o2.marks?-1:1; // ternary operator ? }
		 * 
		 * };
		 */			
			//((Student o1, Student o2)  -> {  return o1.marks>o2.marks?-1:1;	 })
			
			Collections.sort(studs);
			//Collections.sort(studs, ((Student o1, Student o2)  -> {  return o1.marks>o2.marks?-1:1;	 }));
					
			
			for (Student s : studs) {
				System.out.println(s);
			}
		}
	}

