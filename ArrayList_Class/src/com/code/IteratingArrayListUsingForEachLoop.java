package com.code;

import java.util.ArrayList;

public class IteratingArrayListUsingForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Aavya");
		al.add("Mansi");
		al.add("Shubhangi");
		al.add("Richa");
		
		for(String elem:al)
		{
			System.out.println(elem);
		}
		
	}
}
