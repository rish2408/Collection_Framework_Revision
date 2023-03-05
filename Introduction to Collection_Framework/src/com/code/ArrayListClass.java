package com.code;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
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
