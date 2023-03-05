package com.code.UserdefinedClassObjectsInArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student(1, "Rishabh", 26);
		Student st2 = new Student(2, "Komal", 25);
		Student st3 = new Student(3, "Mansi", 28);
		Student st4 = new Student(4, "Avimanyu", 24);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		al.add(st4);
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student eachSt = itr.next();
			System.out.println(eachSt.rollNo+" "+eachSt.name+" "+eachSt.age);
		}
	}
}
