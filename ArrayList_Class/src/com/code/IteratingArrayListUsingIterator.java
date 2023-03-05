package com.code;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayListUsingIterator {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Mansi");
		al.add("Shubhangi");
		al.add("Richa");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
