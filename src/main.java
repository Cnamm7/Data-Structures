public class Main {
  public static void main(String[] args) {
	  SinglyLinkedList list = new SinglyLinkedList();
	  boolean m = list.isEmpty();
	  System.out.println(m);
	  list.insertAtEnd("person1");
	  list.insertAtEnd("person2");
	  list.insertAtEnd("person3");
	  boolean m1 = list.isEmpty();
	  System.out.println(m1);
	  list.print();
	  System.out.println("The list contains " + list.count + " elements.");
	  list.removeFromEnd();
	  list.print();
	  System.out.println("Now the list contains " + list.count + " elements.");
  }

}

