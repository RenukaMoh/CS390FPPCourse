package lesson9.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Java");
		queue.offer("DotNet");
		queue.offer("PHP");
		queue.offer("HTML");
		queue.add("Android");
		System.out.println(queue);
		// Retrieve the front data
		  System.out.println("Top Element: " + queue.element());
		System.out.println("Top Element: " + queue.peek());

		// Removal
		System.out.println("Front deleted Element: " + queue.remove());// Throw NoSuchElement Exception
		System.out.println("Deleted using poll: " + queue.poll());
		queue.clear();
		System.out.println(queue);
		 //System.out.println("remove: " +  queue.remove());
		System.out.println("poll: " + queue.poll());
		//System.out.println(queue);
		//queue.clear();
		//System.out.println(queue);
		//System.out.println("Remove : " + queue.element());

		// System.out.println("Top Element: " + queue.element());
		// System.out.println("poll: " + queue.poll());
		//   System.out.println("Remove : " + queue.remove());
		System.out.println("Top Element: " + queue.peek());
		// queue.removeAll(queue);
	//	System.out.println(queue.size());
		//   System.out.println("remove: " +  queue.element()); // throw exception, when the queue is empty
		// System.out.println("Top Element: " + queue.peek());// return null if the queue is empty

	}

}
