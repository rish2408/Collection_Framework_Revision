package com.code;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayListUsingForEachRemainingMethod {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Harsh");
		al.add("Mansi");
		al.add("Shruti");
		al.add("Richa");
		
		Iterator<String> itr = al.iterator();
		
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}
}
