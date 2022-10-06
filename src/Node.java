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
public class Node<T>{
	T data;
	Node<T> nextNode;
	/**
	 * Node constructor
	 */
	public Node()
	{
		nextNode=null;
		data= data;
	}
	/**
	 * Setter for data
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}
	/**
	 * Getter for data
	 * @return
	 */
	public T getData() {
		return data;
	}
	/**
	 * Getter for nextNode
	 * @return
	 */
	public Node<T> getNextNode() {
		return nextNode;
	}
	/**
	 * Getter for Node
	 * @return
	 */
	public Node<T> getNode() {
		return this;
	}
	/**
	 * Setter for nextNode
	 * @param nextNode
	 */
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}//end class
