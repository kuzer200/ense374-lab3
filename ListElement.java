
/**
 * FILENAME:
 * ListElement.java
 *
 * DESCRIPTION:
 * This file encapsulates the nodes of a linked list.
 *
 * @version 1.00 2015-11-01
 * @author Eric Kuz 200245204
 *
 **/

public class ListElement
{
	private ListElement next;
	private ListElement prev;
	private int data;

	public ListElement()
	{
		data = 0;
		next = null;
		prev = null;
	}

	public ListElement(int data1)
	{
		data = data1;
		next = null;
		prev = null;
	}

	public void setData(int newdata)
	{
		data = newdata;
	}

	public int getData()
	{
		return data;
	}

	public void setNext(ListElement newnext)
	{
		next = newnext;
	}

	public ListElement getNext()
	{
		return next;
	}

	public void setPrev(ListElement newnext)
	{
		prev = newnext;
	}

	public ListElement getPrev()
	{
		return prev;
	}
};
