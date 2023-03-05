package com.code;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> hashst = new HashSet<>();
		hashst.add("Rishabh");
		hashst.add("Mansi");
		hashst.add("Rishabh");
		hashst.add("Avimanyu");
		hashst.add("Shubhangi");
		
		Iterator<String> itr = hashst.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
