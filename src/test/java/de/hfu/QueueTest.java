package de.hfu;
import static org.junit.Assert.*;

public class QueueTest {


	public void TestQueue_1() {
		
		Queue queue=new Queue(3);
		try {queue.dequeue();}
		catch (IllegalStateException e) {
			
		}
		
	}
	
	public void TestQueue_2(){
		Queue queue= new Queue (3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		queue.dequeue();
		 
		assertTrue (queue.dequeue() ==40);
		
	}
	public void TestQueue_3(){
		Queue queue= new Queue (3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		 
		assertTrue (queue.dequeue() ==2);
		assertTrue (queue.dequeue() ==3);
		assertTrue (queue.dequeue() ==4);
		
}
}