package com.code;

import java.util.ArrayList;

public class GetAndSetArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Aavya");
		al.add("Mansi");
		al.add("Shubhangi");
		al.add("Richa");
		
		System.out.println(al.get(2));
		System.out.println("=========");
		System.out.println(al.set(1, "Rishabh"));	// It will change the given index value with current value
		System.out.println("=========");			// and return the replaced value.
		
		for(String elem:al)
		{
			System.out.println(elem);
		}
	}
}
