
public class SinglyLinkedList {
	public class Token {
		String data;
		Token next;
		Token(String inputS)
		{
			data = inputS;
			next = null;
		}
	}
	int count = 0;
	Token head = new Token(null);
	Boolean isEmpty()
	{
		if(count == 0) {return true;}
		else {return false;}
	}	
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
	void removeFromEnd()
	{
		if(this.isEmpty())
		{
			System.out.println("The stack is empty");
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
	void print()
	{
		Token temp = head.next;
		System.out.print("Singly Linked List = [");
		while(temp.next != null)
		{
			System.out.print(temp.data + ", ");
			temp = temp.next;			
		}
		System.out.println(temp.data + "]");
	}	
}
