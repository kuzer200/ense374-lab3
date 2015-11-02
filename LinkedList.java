
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

//	adds an element to the list.
//	@arguments: value of element to add
//	@returns: none

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
			newNode.setPrev(tail);
			tail = newNode;
		}

		elementCount++;
	}

//	gets an element from the list.
//	@arguments: index value to get element from
//	@returns: none

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

//	Deletes an element from the list.
//	@arguments: index value to find element at
//	@returns: none

	public void deleteElement(int index)
	{
		System.out.println("deleting element at index " + index);

		if (elementCount == 0)
		{
			System.out.println("Error: List is empty.");
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
			if (elementCount == 1)
			{	
				head = null;
				tail = null;
			}
			else
			{
				head = currentNode.getNext();
				head.setPrev(null);
				nodeToDelete = null;
				elementCount--;
			}
			return;
		}

		if (index == elementCount - 1)
		{
			elementCount--;
			nodeToDelete = tail;
			tail = tail.getPrev();
			tail.setNext(null);
			nodeToDelete = null;
			return;
		}

		nodeToDelete = nodeToDelete.getNext();

		for (int i = 0; i < (index - 1); i++)
		{
			nodeToDelete = nodeToDelete.getNext();
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(nodeToDelete.getNext());
		currentNode.getNext().setPrev(currentNode);
		nodeToDelete = null;	
		elementCount--;	
	}

//	Prints the list starting from the head node.
//	@arguments: none
//	@returns: none

	public void printLinkedListHead()
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

//	Prints the list backwards starting from the tail node.
//	@arguments: none
//	@returns: none

	public void printLinkedListTail()
	{
		ListElement currElement = tail;

		if (tail == null)
		{
			System.out.println("The list is empty.");
			return;
		}

		while (currElement != null)
		{
			System.out.print(currElement.getData() + " ");
			currElement = currElement.getPrev();
		}
		System.out.println("");
	}
}
