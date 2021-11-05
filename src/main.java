public class Main {
  public static void main(String[] args) {
	  SinglyLinkedList l = new SinglyLinkedList();
	  boolean m = l.isEmpty();
	  System.out.println(m);
	  l.insertAtEnd("sina");
	  l.insertAtEnd("baba");
	  l.insertAtEnd("saba");
	  boolean m1 = l.isEmpty();
	  System.out.println(m1);
	  l.print();
	  System.out.println("the list contains " + l.count + " elements.");
  }

}

