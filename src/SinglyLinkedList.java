/**@author Cna
 * implementing a singly linked list class for using as a stack, with two
 * resources, one is count which is the number of elements in linked list
 * and one for empty head pointer.
 */
public class SinglyLinkedList {
	
	/**
	 * @author Cna
	 *Crating a Token class for using as bricks of linked list structure,
	 *with two resources, String data for storing the text in each tokens
	 *and pointer of Token next to the next Token.
	 */
	public class Token {
		String data;
		Token next;
		/**
		 * Constructor of Token class, initialize data with input parameter
		 * and next with null
		 * @param inputS
		 * 
		 */
		Token(String inputS)
		{
			data = inputS;
			next = null;
		}
	}
	
	int count = 0;
	Token head = new Token(null);
	/**
	 * checks whether list is empty or not.
	 * @return boolean
	 */
	Boolean isEmpty()
	{
		if(count == 0) {return true;}
		else {return false;}
	}	
	/**
	 * gets the text input and put it at the end of the list, by creating
	 * new Token, if the list is empty, add the Token after the head pointer,
	 * else, traverse through the list to find the last token and put it
	 * after the last one. at the end increase the count by one.
	 * @param input
	 */
	void insertAtEnd(String input)
	{
		Token newToken = new Token(input);
		if(this.isEmpty())
		{
			head.next = newToken;
		}else {
			Token temp = head.next;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newToken;	
		}
		count++;	
	}
	/**
	 * remove the last token from the list, first check the list, if it's empty,
	 * throws exception, else, by using the count traverse the list and find the
	 * token before the last one and put it to null, at the end decrease the count
	 * by one.
	 */
	void removeFromEnd()
	{
		if(this.isEmpty())
		{
			throw new IllegalArgumentException("The stack is empty");
		}else {
			Token temp = head.next;
			for(int i = 1; i < (count - 1) ; i++)
			{
				temp = temp.next;
			}
			temp.next = null;
			count--;
		}
	}
	/**
	 * print the whole list by traversing through all tokens
	 * and printing them in new lines.
	 */
	void print()
	{
		Token temp = head.next;
		while(temp.next != null)
		{
			System.out.println(temp.data);
			temp = temp.next;			
		}
		System.out.println(temp.data);
	}	
}
