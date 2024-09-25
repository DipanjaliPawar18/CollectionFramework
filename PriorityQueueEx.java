package com.queueInterface;

import java.util.PriorityQueue;
public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(90);
		q.add(10);
		q.add(56);
		q.add(1);
		q.add(2);
		
		System.out.println(q);
		System.out.println(q.size());
		
		q.offer(5);
		q.offer(6);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println("the front element is : "+q.element());
		System.out.println("the front element is : "+q.peek());
		q.clear();
		System.out.println(q);
		//System.out.println("the front element is : "+q.element());
		System.out.println("the front element is : "+q.peek());
		//q.remove();
		System.out.println(q.poll());
	}
}