package com.code;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet<String> treset = new TreeSet<>();
		treset.add("Rishabh");
		treset.add("Mansi");
		treset.add("Rishabh");
		treset.add("Komal");
		treset.add("Muskan");
		
		Iterator<String> itr = treset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
