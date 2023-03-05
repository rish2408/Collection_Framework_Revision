package com.code;

import java.util.ArrayList;

public class IteratingArrayListUsingForEachMethod {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Shivam");
		al.add("Mansi");
		al.add("Happy");
		al.add("Richa");
		
		al.forEach(a->{
			System.out.println(a);
		});
	}
}
