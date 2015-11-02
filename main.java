/**
 * FILENAME:
 * main.java
 *
 * DESCRIPTION:  This program allows users to create a double-linked list.  Users can add nodes, delete nodes, and print the list from the head or backwards from the tail.
 * 
 *
 * @version 1.00 2015-11-01
 * @author Eric Kuz 200245204
 *
 **/

import java.util.Scanner; 

class LinkedListProgram
{
	static Scanner input = new Scanner(System.in);

	static LinkedList list = new LinkedList();
	static String option;
	static int value;
	static boolean finished  = false;
	
	public static void main (String args[])
	{
		int i = 0;
		while (!finished)
		{
			System.out.println("What would you like to do?");
			System.out.println("add x \tAdd element \'x\' to list");
			System.out.println("get x \tGet value of item from index \'x\'");
			System.out.println("del x \tDelete item from index \'x\'");			
			System.out.println("print_h \tPrint contents of list from head");
			System.out.println("print_t \tPrint contents of list from tail");
			System.out.println("exit \tExit program");
			System.out.print("Make your selection: ");
			option = input.next();
			
			if (option.equals("add") || option.equals("get") || option.equals("del"))
			{
				value = input.nextInt();
			}

			switch (option)
			{
				case "add": list.addElement(value); break;
				case "get": list.getElement(value); break;
				case "del": list.deleteElement(value); break;
				case "print_h": list.printLinkedListHead(); break;
				case "print_t": list.printLinkedListTail(); break;
				case "exit": finished = true; break;
				default: System.out.println("Error: Invalid input.");
			}
		}
		
		System.out.println("User terminated program.");
	}
}
