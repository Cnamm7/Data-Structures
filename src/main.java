import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {  
	  Stack stack = new Stack();
	  try {
		  File file = new File("Test.txt");
		  Scanner myReader = new Scanner(file);
		  while(myReader.hasNextLine())
		  {
			  String data = myReader.nextLine();
			  if(data.equals("POP"))
			  {
				  stack.pop();
			  }else if(data.equals("PRINT"))
			  {
				  stack.print();
			  }else {
				  stack.push(data);
			  }
			  
		  }
	  } catch(FileNotFoundException e)
	  {
		  System.out.println("File not found");
		  e.printStackTrace();
	  }	  
  }

}

