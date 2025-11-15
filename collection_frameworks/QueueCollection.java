//we can implement  LinkedList,PriorityQueue of Queue interface 
import java.util.*;
class QueueCollection{
	public static void main(String args[]){
		
		//queue interface using linkedlist
		Queue<Integer>q=new LinkedList<Integer>();
		q.add(12);
		q.add(13);
		q.add(2);
		q.offer(14); //offer==add same work but add may throw exception
		System.out.println("Queue "+q);
		q.remove();
		System.out.println("Queue "+q);
		q.poll();  //poll== remove but also remove through exception but poll will return null value
		System.out.println("Queue "+q);
		
		q.peek();//getting first index
		
		
		//deque using array deque
		Deque<Integer>dq=new ArrayDeque<>();
		dq.offer(10);
		dq.offer(30);
		dq.offerFirst(20);
		dq.offer(40);
		System.out.println("Deque: "+dq);
		dq.pollFirst();
		dq.pollLast();
		System.out.println("Deque: "+dq);
		
		//Priority queue implementation
		PriorityQueue<Integer>pqMin=new PriorityQueue<>();//Min Heap
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());//Max Heap
		pq.offer(10);
		pq.add(20);
		pq.offer(5);
		pq.offer(12);
		
		System.out.println("Priority Queue: "+pq);
		System.out.println("Priority Queue peek element: "+pq.peek());
		

	}
}