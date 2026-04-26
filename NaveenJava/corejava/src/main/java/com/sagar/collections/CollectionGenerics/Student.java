package com.sagar.collections.CollectionGenerics;

import java.util.Comparator;

public class Student implements Comparable<Student>
{
	int rollnum;
	int marks;
	
	public Student(int rollnum, int marks) {
		super();
		this.rollnum = rollnum;
		this.marks = marks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.marks>s.marks?-1:1;
	}
	
}

