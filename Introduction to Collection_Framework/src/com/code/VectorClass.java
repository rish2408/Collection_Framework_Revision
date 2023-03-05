package com.code;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> vect = new Vector<>();
		vect.add("Ram");
		vect.add("Shyam");
		vect.add("Sita");
		vect.add("Geeta");
		
		Iterator<String> itr = vect.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
