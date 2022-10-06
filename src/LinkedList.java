import java.util.*;
/**
 * @author njohnson3
 *
 */
/**
 * 
 * @author Joshua Domzalski
 *
 * @param <T>
 * Changed the data type of the variables to generic versions of type T.
 */
public class LinkedList <T>{
	
	Node<T> head;
	int length;
	Node<T> tail;
	/**
	 * LinkedList constructor
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	/**
	 * Method to see if the list is empty
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	/**
	 * Getter for list
	 * @return
	 */
	public Node <T>getList()
	{
		return head;
	}
	/**
	 * Method that adds a node to the list based off certain requirements
	 * @param aNode
	 */
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
}//end class

