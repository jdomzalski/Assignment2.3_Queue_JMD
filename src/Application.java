import java.util.*;

/**
 * @author Joshua Domzalski
 * Assignment 2.3
 * CS215 Fall 2022
 *
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * Creating a Queue
		 */
		Queue aQueue = new Queue();
		
		/**
		 * Creating several Nodes and setting the data within each node to corresponding data we will be using in our queue
		 */
		Node bill = new Node();
		bill.setData("Bill");
		Node alice = new Node();
		alice.setData("Alice");
		Node bob = new Node();
		bob.setData("Bob");
		Node jane = new Node();
		jane.setData("Jane");
		Node hamad = new Node();
		hamad.setData("Hamad");
		Node jim = new Node();
		jim.setData("Jim");
		
		
		/**
		 * Adding Bill, Alice, and Bob to the queue and then printing the queue
		 */
		aQueue.enqueue(bill);
		aQueue.enqueue(alice);
		aQueue.enqueue(bob);
		
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Removing Bill from the queue, as he has been served
		 */
		aQueue.dequeue();
		
		/**
		 * Printing the queue
		 */
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Adding Jane to the queue and then printing the queue
		 */
		aQueue.enqueue(jane);
		
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Adding Hamad to the queue and then printing the queue
		 */
		aQueue.enqueue(hamad);
		
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Removing Alice and Bob from the queue, as they have both been served, and then printing the queue
		 */
		aQueue.dequeue();
		aQueue.dequeue();
		
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Adding Jim to the queue and then printing the queue
		 */
		aQueue.enqueue(jim);
		
		aQueue.getContents();
		
		System.out.println("\n");
		
		/**
		 * Removing Jane and Hamad from the queue, as they have both been served, and then printing the queue
		 */
		aQueue.dequeue();
		aQueue.dequeue();
		
		aQueue.getContents();
		

	}//end main
	

}//end class
