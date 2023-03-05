package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Shubhangi");
		al.add("Mansi");
		al.add("Aavya");
		al.add("Richa");
		
		Collections.sort(al);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(24);
		al2.add(14);
		al2.add(38);
		al2.add(7);
		
		Collections.sort(al2);
		
		for(Integer elem:al2)
		{
			System.out.println(elem);
		}
	}
}
