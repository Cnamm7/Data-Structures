
public class Stack {
	SinglyLinkedList stack = new SinglyLinkedList();
	void push(String text)
	{
		stack.insertAtEnd(text);
	}
	void pop()
	{
		stack.removeFromEnd();
	}
	void print()
	{
		stack.print();
	}
}
