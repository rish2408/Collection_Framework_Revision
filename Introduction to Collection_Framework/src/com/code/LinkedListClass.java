package com.code;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Rishabh");
		list.add("Mansi");
		list.add("Shubhangi");
		list.add("Avimanyu");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
