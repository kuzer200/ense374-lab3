public class ListElement
{
	private ListElement next;
	private int data;

	public ListElement()
	{
		data = 0;
		next = null;
	}

	public ListElement(int data1)
	{
		data = data1;
		next = null;
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
};
