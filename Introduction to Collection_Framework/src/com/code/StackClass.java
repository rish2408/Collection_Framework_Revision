package com.code;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<String> stck = new Stack<>();
		
		stck.push("Aavya");
		stck.push("Krishna");
		stck.push("Richa");
		stck.push("Anupam");
		stck.pop();
		
		Iterator<String> itr = stck.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
