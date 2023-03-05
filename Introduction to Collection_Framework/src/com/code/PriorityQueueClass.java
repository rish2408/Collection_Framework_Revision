package com.code;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		
		PriorityQueue<String> prior = new PriorityQueue<>();
		prior.add("Rishabh");
		prior.add("Mansi");
		prior.add("Shubhangi");
		prior.add("Avimanyu");
		
		Iterator<String> itr = prior.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("===========================");
		System.out.println(prior.element());
		System.out.println(prior.peek());
		System.out.println(prior.remove());
		System.out.println(prior.poll());
		System.out.println("===========================");
		Iterator<String> itr2 = prior.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
