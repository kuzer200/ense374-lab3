
/**
 * FILENAME:
 * LinkedList.java
 *
 * DESCRIPTION:
 * This file encapsulates a linked list of integers.
 *
 * @version 1.00 2015-11-01
 * @author Eric Kuz 200245204
 *
 **/

public class LinkedList
{
	private ListElement head;
	private ListElement tail;
	private int elementCount;

	public LinkedList()
	{
		head = null;
		tail = null;
		elementCount = 0;
	}

//	Adds an element to the list.
//	@arguments: integer value to add
//	@returns: void

	public void addElement(int value)
	{
		ListElement newNode = new ListElement(value);

		if (head == null)
		{
			System.out.println("Added a new node with value " + newNode.getData());
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.setNext(newNode);
			tail = newNode;
		}

		elementCount++;
	}

//	Prints the value of an element at a specified index.
//	@arguments: index of element to get
//	@returns: void

	public void getElement(int index)
	{
		if (index >= elementCount)
		{
			System.out.println("Error: index out of range.  Range is from 0 to " + (elementCount - 1));
			return;
		}

		ListElement currentNode = head;

		for (int i = 0; i < index; i++)
		{
			currentNode = currentNode.getNext();
		}

		System.out.println("Value of node at index " + index + ": " + currentNode.getData());
	}

//	Deletes the element at a specified index.
//	@arguments: index of element to delete
//	@returns: void

	public void deleteElement(int index)
	{
		if (elementCount == 0)
		{
			System.out.println("Error: list is empty.");
			return;
		}

		if (index >= elementCount)
		{
			System.out.println("Error: index out of range.  Range is from 0 to " + (elementCount - 1));
			return;
		}

		ListElement currentNode = head;
		ListElement nodeToDelete = head;

		if (index == 0)
		{
			head = currentNode.getNext();
			nodeToDelete = null;
			elementCount--;
			return;
		}

		nodeToDelete = nodeToDelete.getNext();

		for (int i = 0; i < (index - 1); i++)
		{
			nodeToDelete = nodeToDelete.getNext();
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(nodeToDelete.getNext());
		nodeToDelete = null;	
		elementCount--;	
	}

//	Prints the elements starting from the head node.
//	@arguments: none
//	@returns: void

	public void printLinkedList()
	{
		ListElement currElement = head;

		if (head == null)
		{
			System.out.println("The list is empty.");
			return;
		}

		while (currElement != null)
		{
			System.out.print(currElement.getData() + " ");
			currElement = currElement.getNext();
		}
		System.out.println("");
	}
}
