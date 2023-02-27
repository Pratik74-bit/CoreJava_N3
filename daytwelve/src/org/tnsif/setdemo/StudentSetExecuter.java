package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecuter {
	
	public static void addStudent (Set<Student> obj1) {
		Student s1 = new Student(101,"Pratik",86.57f);
		Student s2 = new Student(115,"Manoj",80.55f);
		Student s3 = new Student(122,"Sahil",84.66f);
		obj1.add(s1);
		obj1.add(s2); 
		obj1.add(s3);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Set<Student>obj = new LinkedHashSet<Student>();
		addStudent(obj);
		System.out.println(obj);

	}

}
