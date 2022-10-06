import java.util.*;

/**
 * @author Joshua Domzalski
 * Assignment 2.3
 * CS215 Fall 2022
 *
 */

public class Queue<T> implements QueueInterface {

	/**
	 * Creating both a LinkedList and a Node object that are both parameterized with type String 
	 */
	LinkedList<String> myQueue = new LinkedList<String>();
	Node<String> myNode = new Node<String>();
	
	/**
	 * Queue constructor
	 */
	public Queue() {
		myQueue = new LinkedList();
	}
	
	/**
	 * Enqueue method that class the addNode method from LinkedList to add a new entry to the queue
	 */
	@Override
	public void enqueue(Object newEntry) {
		myQueue.addNode((Node) newEntry);
		
	}

	/**
	 * Dequeue method that removes the Node at the head of the LinkedList and at the front of the queue from the queue
	 */
	@Override
	public Object dequeue(){
		Object front = getFront();
		
		myQueue.head.setData(null);
		myQueue.head = myQueue.head.getNextNode();
		if(myQueue.head == null) {
			myQueue.tail = null;
		}
		
		return front;
	}



	/**
	 * Method that returns the object in the front of the queue
	 */
	@Override
	public Object getFront() {
		
		return myQueue.head;
	}

	/**
	 * Method that checks whether or not the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return myQueue.isEmpty();
	}
	
	/**
	 * Method that prints out the data of all the objects in the queue
	 */
	public void getContents() {
		Node gentempnode1 = (Node) myQueue.head;
		do
		{
			System.out.println(gentempnode1.getData());
			gentempnode1 = gentempnode1.getNextNode();
		}while (gentempnode1 != null);
	}
	
	
	
}//end class
