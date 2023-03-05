package com.code;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratingArrayListUsingListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");
		al.add("Shyam");  
		al.add("Akash");  
		al.add("Vikas");
		
		ListIterator<String> listItr = al.listIterator(al.size());
		
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}
}
