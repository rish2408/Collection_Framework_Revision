package com.code;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedset = new LinkedHashSet<>();
		linkedset.add("Mansi");
		linkedset.add("Rishabh");
		linkedset.add("Mansi");
		linkedset.add("Shubhangi");
		linkedset.add("Avimanyu");
		
		Iterator<String> itr = linkedset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
