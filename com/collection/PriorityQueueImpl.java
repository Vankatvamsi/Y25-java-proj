package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(10);
		p1.add(20);
		p1.add(100);
		p1.add(30);
		p1.add(1000);
		System.out.println("Elements are: "+p1);
		System.out.println(p1.peek());
		p1.poll();
		System.out.println("Elements are: "+p1);
		System.out.println("size of an object: "+p1.size());
		p1.remove();
		System.out.println("Elements are: "+p1);
		
	}

}