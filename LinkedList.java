
/**
 * FILENAME:
 * LinkedList.java
 *
 * DESCRIPTION:
 * This file encapsulates a linked list of integers.
 *
 * @version 1.00 2015-10-19
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

	public void deleteElement(int index)
	{
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
