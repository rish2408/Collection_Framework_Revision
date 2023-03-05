package com.code;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeClass {

	public static void main(String[] args) {
		
		ArrayDeque<String> arraydeq = new ArrayDeque<>();
		arraydeq.add("Rishabh");
		arraydeq.add("Mansi");
		arraydeq.add("Deepak");
		arraydeq.add("Kapil");
		
		Iterator<String> itr = arraydeq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
