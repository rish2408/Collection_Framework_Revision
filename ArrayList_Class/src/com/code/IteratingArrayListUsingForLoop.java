package com.code;

import java.util.ArrayList;

public class IteratingArrayListUsingForLoop {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Komal");
		al.add("Mansi");
		al.add("Shubhangi");
		al.add("Richa");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
