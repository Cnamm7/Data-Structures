/**
 * 
 * @author Cna
 *Stack class, by creating an object of singly linked list and simulate
 *the stack with 3 methods, push, pop and print.
 */
public class Stack {
	SinglyLinkedList stack = new SinglyLinkedList();
	/**
	 * by getting the text, push it at the last of list
	 * @param text
	 */
	void push(String text)
	{
		stack.insertAtEnd(text);
	}
	/**
	 * pop the last element of the list
	 */
	void pop()
	{
		stack.removeFromEnd();
	}
	/**
	 * print the entire list
	 */
	void print()
	{
		stack.print();
	}
}
